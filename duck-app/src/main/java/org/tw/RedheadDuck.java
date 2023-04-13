package org.tw;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    @Override
    public String display() {
        return "Display RedheadDuck!";
    }

    public String quack(){
        return "quack!";
    }

    public String fly() {
        return "flying!!";
    }
}
