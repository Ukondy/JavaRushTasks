package com.javarush.task.pro.task13.task1314;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        int count = 0;
        Node node = first.next;
        while(node != null) {
            if(count == index) {
                return node.value;
            }
            node = node.next;
            count++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
