public interface FlyBehavior {
    private String fly(){
        return null;
    }

    default String getFly(){
        return fly();
    }

}
