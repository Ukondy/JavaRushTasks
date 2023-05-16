package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        public void eat() {

        }
        public void move() {

        }
    }

    public class Duck implements CanEat, CanMove, CanFly {
        public void eat() {

        }
        public void move() {

        }
        public void fly() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly{
        public void move() {

        }
        public void fly() {

        }
    }
}
