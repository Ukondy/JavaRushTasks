package com.javarush.task.jdk13.task41.task4102;

public class WithSausage extends PizzaDecorator{
    public WithSausage(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", колбаса";
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }
}
