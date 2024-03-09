package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private HashMap<String, String> store;

    public InMemoryKV(Map<String, String> store) {
        this.store = new HashMap<String, String>(store);
    }

    @Override
    public void set(String key, String value) {
        this.store.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.store.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (this.store.get(key) == null) {
            return defaultValue;
        } else {
            return this.store.get(key);
        }
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<String, String>(this.store);
    }
}
// END
