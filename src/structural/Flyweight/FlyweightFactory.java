package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂
public class FlyweightFactory {
    private Map<String, Flyweight> pool = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteFlyweight(key));
        }
        return pool.get(key);
    }
}
