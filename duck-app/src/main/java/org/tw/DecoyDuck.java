package org.tw;

public class DecoyDuck extends Duck {
    @Override
    public String display() {
        return "Display Decoy duck!";
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String quack() {
        return null;
    }
}
