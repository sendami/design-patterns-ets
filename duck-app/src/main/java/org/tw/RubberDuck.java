package org.tw;

public class RubberDuck extends Duck {
    @Override
    public String display() {
        return "Display Rubber duck!";
    }

    @Override
    public String quack() {
        return "squeak!!";
    }

    @Override
    public String fly() {
        return null;
    }
}
