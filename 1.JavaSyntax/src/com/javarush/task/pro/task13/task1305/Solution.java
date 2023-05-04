package com.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* 
Найти и обезвредить
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).toLowerCase().contains("bug")) {
                list.remove(i);
                removeBugWithFor(list);
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            if(String.valueOf(iterator.next()).toLowerCase().equals("bug")) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        int temp = 0;
        for (String s : list) {
            if(s.toLowerCase().equals("bug")) {
                temp = list.indexOf(s);
            }
        }
        list.remove(temp);
        boolean tp = false;
        for(String s : list) {
            if(s.toLowerCase().equals("bug")) {
                tp = true;
            }
        }
        if(tp) {
            removeBugWithCopy(list);
        }

    }
}
