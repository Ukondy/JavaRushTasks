package com.javarush.task.pro.task18.task1815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Преобразование данных
*/

public class Solution {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        Stream<Account> streamMap = accounts.stream();
        Stream<String> streamEnd = streamMap.map(account -> account.getEmail());
        return streamEnd;
    }
}
