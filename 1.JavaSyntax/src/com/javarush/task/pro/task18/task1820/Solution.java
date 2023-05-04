package com.javarush.task.pro.task18.task1820;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/* 
Самый дорогой автомобиль
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
        Optional<Car> optionalCar = cars.max((e1, e2) -> e1.getPrice() - e2.getPrice());
        return optionalCar;
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        Optional<Car> optionalResult = cars
                .filter(c -> c.getPrice() > mostExpensiveCar.getPrice())
                .findFirst();
        return optionalResult;
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
