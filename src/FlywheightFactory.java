import java.util.HashMap;
import java.util.Map;

public class FlywheightFactory {
    private static Map<String, Flyweight> hash_fly = new HashMap<>();

    public static Flyweight getFly(String key){
        if(hash_fly.containsKey(key)){
            return hash_fly.get(key);
        }else{
            ConcreteFlyweight fly = new ConcreteFlyweight(key);
            hash_fly.put(key, fly);
            return fly;
        }
    }
}
