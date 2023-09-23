package com.javarush.task.task28.task2807;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Знакомство с ThreadPoolExecutor
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

        IntStream.rangeClosed(1, 10)
                .mapToObj(i -> (Runnable) () -> doExpensiveOperation(i))
                .forEach(queue::add);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,5, 1000, TimeUnit.MILLISECONDS, queue);
        threadPoolExecutor.prestartAllCoreThreads();
        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(5, TimeUnit.SECONDS);

        /* Example output
pool-1-thread-2, localId=2
pool-1-thread-3, localId=3
pool-1-thread-1, localId=1
pool-1-thread-3, localId=5
pool-1-thread-2, localId=4
pool-1-thread-3, localId=7
pool-1-thread-1, localId=6
pool-1-thread-3, localId=9
pool-1-thread-2, localId=8
pool-1-thread-1, localId=10
         */
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
