package com.hurenxiang.completeFuture;

import java.util.concurrent.*;

public class CompleteFuTest1 {

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
            50,
            10,
            TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(100),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("主线程 start......");
//        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//            System.out.println("任务1 子线程执行了......" + Thread.currentThread().getName());
//        }, executor).whenCompleteAsync((res,exec)->{
//            System.out.println("whenCompleteAsync1" + Thread.currentThread().getName());
//            System.out.println("res = " + res);
//            System.out.println("exec = " + exec);
//        });
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("任务2 子线程执行了......" + Thread.currentThread().getName());
            return 10;
        //res是上面integerCompletableFuture的返回值，exec是上面的报错信息
        }, executor).whenCompleteAsync((res,exec)->{
            System.out.println("whenCompleteAsync2" + Thread.currentThread().getName());
            System.out.println("res = " + res);
            System.out.println("exec = " + exec);
        }).exceptionally((e)->{
            System.out.println("e = " + e);
            return 100;
        });
        System.out.println("主线程 end......"+ integerCompletableFuture.get());
    }
}
