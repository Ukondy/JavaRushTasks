package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public class UsersView implements View{
    private Controller controller;
    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users: ");
        modelData.getUsers().forEach(u -> System.out.println("\t" + u));
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

}
