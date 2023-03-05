public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }


    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String display() {
        return " made out of rubber with orange picker!";
    }

    @Override
    public String origin() {
        return "Toy factories";
    }

    @Override
    public String color() {
        return "Yellow";
    }

    @Override
    public int age() {
        return 100;
    }


    @Override
    public String toString() {
        return "she is: "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"\nFly : "+performFly()+"\nQuack : "+performQuack()+"\nWeight : "+weight();
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
        return 0.150;
    }

}