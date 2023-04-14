package org.tw;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    @Override
    public String display() {
        return "Display RedheadDuck!";
    }

}
