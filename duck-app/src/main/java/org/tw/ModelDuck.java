package org.tw;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    @Override
    public String display() {
        return "It's a Model duck";
    }
}
