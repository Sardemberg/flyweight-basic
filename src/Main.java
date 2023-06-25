public class Main {
    public static void main(String[] args) {
        Flyweight test1 = FlywheightFactory.getFly("chave1");
        test1.operation();

        Flyweight test2 = FlywheightFactory.getFly("chave2");
        test2.operation();

        Flyweight teste3 = FlywheightFactory.getFly("chave3");
        teste3.operation();
    }
}