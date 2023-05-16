package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }
 public abstract class Human implements CanRun, CanSwim{

 }
}
