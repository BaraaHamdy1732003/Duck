public interface QuackBehavior {
    private String quack(){
        return null
                ;
    }

    default String getQuack(){
        return quack();
    }
}