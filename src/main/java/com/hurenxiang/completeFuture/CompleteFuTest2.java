package com.hurenxiang.completeFuture;

import java.util.concurrent.*;

public class CompleteFuTest2 {

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
            50,
            10,
            TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(100),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("主线程 start......");
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("任务1 子线程执行了......" + Thread.currentThread().getName());
        }, executor).thenRunAsync(()->{
            System.out.println("任务2 子线程执行了......" + Thread.currentThread().getName());
        },executor);

        CompletableFuture.supplyAsync(() -> {
            System.out.println("任务3 子线程执行了......" + Thread.currentThread().getName());
            return 100;
        }, executor).thenAcceptAsync((res)->{
            System.out.println("任务4 子线程执行了......" + res);
        },executor);
    }
}
