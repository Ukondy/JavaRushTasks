package com.javarush.task.task29.task2909.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @Setter(AccessLevel.PRIVATE)
    private Address address;
    private String name;
    private String surname;
    private int age;
    private boolean man;
    private Work work;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(String country) {
        address.setCountry(country);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    public String getBoss() {
        return work.getBoss();
    }

    public String getAddress() {
            return address.getCountry() + " " + address.getCity() + " " + address.getHouse();
    }

    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Фамилия: " + getSurname());
    }

    public void printAdditionalInfo() {
        System.out.println(getAge() < 16 ? "Пользователь моложе 16 лет" : "Пользователь старше 16 лет");
    }
}