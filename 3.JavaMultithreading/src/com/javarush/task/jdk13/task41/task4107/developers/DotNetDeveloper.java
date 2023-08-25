package com.javarush.task.jdk13.task41.task4107.developers;

public class DotNetDeveloper implements Developer {
    public void study() {
        writeCode();
    }

    @Override
    public void writeCode() {
        System.out.println("Шлепает формы...");
    }
}
