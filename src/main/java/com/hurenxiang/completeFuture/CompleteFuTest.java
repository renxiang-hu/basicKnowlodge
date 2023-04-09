package com.hurenxiang.completeFuture;

import java.util.concurrent.*;

public class CompleteFuTest {

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
            50,
            10,
            TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(100),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        System.out.println("主线程 start......");
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("任务1 子线程执行了......" + Thread.currentThread().getName());
        }, executor);
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("任务2 子线程执行了......" + Thread.currentThread().getName());
            return 100;
        }, executor);
        System.out.println("主线程 end......"+ integerCompletableFuture);
    }
}
