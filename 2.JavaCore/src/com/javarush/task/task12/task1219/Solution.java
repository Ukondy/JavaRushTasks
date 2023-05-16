package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanSwim, CanRun{
        public void run() {

        }
        public void swim() {

        }
    }

    public class Duck implements CanSwim, CanFly, CanRun{

        public void fly() {

        }

        public void run() {

        }

        public void swim() {

        }
    }

    public class Penguin implements CanRun, CanSwim{

        public void run() {

        }

        public void swim() {

        }
    }

    public class Airplane implements CanFly{

        public void fly() {

        }
    }
}
