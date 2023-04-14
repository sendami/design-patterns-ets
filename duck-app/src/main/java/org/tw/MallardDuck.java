package org.tw;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public String display() {
        return "Display MallardDuck!";
    }

    public String quack(){
        return "quack!";
    }

    public String fly() {
        return "flying!";
    }
}
