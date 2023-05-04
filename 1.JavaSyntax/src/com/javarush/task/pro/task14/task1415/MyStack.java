package com.javarush.task.pro.task14.task1415;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String value = storage.get(0);
        storage.remove(value);
        return value;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
