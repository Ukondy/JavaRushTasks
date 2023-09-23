package com.javarush.task.task28.task2802;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/

public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        private String format = "%s-pool-%s-thread-";
        private static AtomicInteger numberOfFactory = new AtomicInteger(1);
        private AtomicInteger numberOfThread = new AtomicInteger(1);
        private String nameFormat;
        private ThreadGroup group;

        public AmigoThreadFactory() {
            group = Thread.currentThread().getThreadGroup();
            nameFormat = String.format(format, group.getName(), numberOfFactory.getAndIncrement());
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(group, r, nameFormat + numberOfThread.getAndIncrement());

            thread.setDaemon(false);
            thread.setPriority(Thread.NORM_PRIORITY);

            return thread;
        }
    }
}
