package com.javarush.task.jdk13.task41.task4102;

public class WithArugula extends PizzaDecorator {
    public WithArugula(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", руккола";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;
    }
}
