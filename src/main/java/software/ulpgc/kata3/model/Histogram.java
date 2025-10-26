package software.ulpgc.kata3.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram implements Iterable<Integer> {

    private final Map<Integer, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, count(key) + 1);
    }

    public Integer count(int key) {
        return map.getOrDefault(key, 0);
    }

    public int size() {
        return map.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        return map.keySet().iterator();
    }
}
