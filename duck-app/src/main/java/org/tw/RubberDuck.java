package org.tw;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public String display() {
        return "Display Rubber duck!";
    }

    @Override
    public String quack() {
        return "squeak!!";
    }
}
