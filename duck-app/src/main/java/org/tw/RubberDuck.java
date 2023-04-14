package org.tw;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public String display() {
        return "Display Rubber duck!";
    }

}
