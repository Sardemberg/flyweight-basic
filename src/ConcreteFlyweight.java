public class ConcreteFlyweight implements Flyweight {
    private String intrinsecState;

    public ConcreteFlyweight(String intrinsecState){
        this.intrinsecState = intrinsecState;
    }
    @Override
    public void operation() {
        System.out.println("This is intrinsec state " + this.intrinsecState);
    }
}
