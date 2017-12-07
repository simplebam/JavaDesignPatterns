package flyweight.base;

import java.util.HashMap;

public class FlyWeightFactory {
    private HashMap<String, FlyWeight> flyWeights = new HashMap<>();

    public FlyWeightFactory() {
        flyWeights.put("X", new ConcreteFlyWeight());
        flyWeights.put("Y", new ConcreteFlyWeight());
        flyWeights.put("Z", new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key) {
        return flyWeights.get(key);
    }
}
