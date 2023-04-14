package org.tw;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public String swim(){
        return "swimming!!";
    }
    public abstract String display();
    public String performFly(){
        return flyBehaviour.fly();
    }
    public String performQuack(){return quackBehaviour.quack();}
    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }
}
