package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = modelData.getUsers();

        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));

        modelData.setUsers(users);
    }
}