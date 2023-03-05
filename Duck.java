public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract boolean swim();
    public abstract String display();

    public abstract String origin();
    public abstract String color();
    public abstract int age();
    public abstract double weight();
    public abstract String toString();

    //New added methods

    public void setFlyBehavior(FlyBehavior fly){flyBehavior = fly;}
    public void setQuackBehavior(QuackBehavior quack){ quackBehavior = quack;}

    protected abstract String performFly();
    protected abstract String performQuack();

}