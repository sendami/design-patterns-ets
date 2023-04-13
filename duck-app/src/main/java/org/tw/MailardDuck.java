package org.tw;

public class MailardDuck extends Duck implements Flyable, Quackable {
    @Override
    public String display() {
        return "Display MailardDuck!";
    }

    public String quack(){
        return "quack!";
    }

    public String fly() {
        return "flying!!";
    }
}
