package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        int[] newInputArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(newInputArray);
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        // напишите тут ваш код

        return new Pair(newInputArray[0], newInputArray[newInputArray.length -1]);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
