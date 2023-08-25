package com.javarush.task.jdk13.task41.task4103.blood;

import com.javarush.task.jdk13.task41.task4103.security.SecuritySystem;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    public BloodDBProxy() {
        Scanner sc = new Scanner(System.in);
        security = new SecuritySystem();
        String login = sc.nextLine();
        String password = sc.nextLine();

        security.authorize(login, password);
        if(security.isAuthorized()) {
            db = new BloodDB();
        }
    }

    @Override
    public BloodSample getById(int id) {
        return security.isAuthorized() ? db.getById(id) : denied;
    }

    @Override
    public List<BloodSample> find(String request) {
        return security.isAuthorized() ? db.find(request) : List.of(denied);
    }
}
