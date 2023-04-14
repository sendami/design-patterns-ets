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

    public String fly() {return "flying!";}

    public abstract String display();
}
