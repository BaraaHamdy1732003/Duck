
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flyBehavior = new FliWithWings();
        quackBehavior = new Quack();
    }


    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String display() {
        return " Millard duck!";
    }


    @Override
    public String origin() {
        return "South Carolina";
    }

    @Override
    public String color() {
        return "Red";
    }

    @Override
    public int age() {
        return 1;
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
        return 3.5;
    }

}