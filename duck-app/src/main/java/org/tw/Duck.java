package org.tw;

public abstract class Duck {

    public Duck() {
    }
    public String quack(){
        return "quack!";
    }

    public String swim(){
        return "swimming!!";
    }


    public abstract String display();

    public String fly() {
        return "flying!!";
    }
}
