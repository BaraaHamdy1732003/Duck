

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteDuck();
    }
    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String display() {
        return "normal ducks!";
    }


    @Override
    public String origin() {
        return "from Factory ";
    }

    @Override
    public String color() {
        return "White & green";
    }

    @Override
    public int age() {
        return 12;
    }

    @Override
    public String toString() {
        return "she is : "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"\nFly : "+performFly()+"\nQqq : "+performQuack()+"\nWeight : "+weight();
    }

    @Override
    public String performFly() {
        return flyBehavior.getFly();
    }

    @Override
    public String performQuack() {
        return quackBehavior.getQuack();
    }

    @Override
    public double weight() {
        return 2.15;
    }

}