package org.tw;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public String swim(){
        return "swimming!!";
    }
    public String performFly(){
        return flyBehaviour.fly();
    }
    public String performQuack(){return quackBehaviour.quack();}

    public abstract String display();
}
