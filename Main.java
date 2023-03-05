public class Main {
    public static void main(String[] args) {
        Duck[] duck = {
                new MallardDuck(),
                new RedHeadDuck(),
                new RubberDuck(),
                new DecoyDuck()
        };


        for (int i = 0; i < duck.length; i++) {
            System.out.println(duck[i].toString()+"\n");
        }
    }
}