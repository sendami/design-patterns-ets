package org.tw;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    @Override
    public String display() {
        return "Display MailardDuck!";
    }
}
