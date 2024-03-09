package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;

    public FileKV(String path, Map<String, String> store) {
        this.path = path;

        Utils.writeFile(this.path, Utils.serialize(store));
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> store = Utils.unserialize(Utils.readFile(this.path));

        store.put(key, value);

        Utils.writeFile(this.path, Utils.serialize(store));
    }

    @Override
    public void unset(String key) {
        Map<String, String> store = Utils.unserialize(Utils.readFile(this.path));

        store.remove(key);

        Utils.writeFile(this.path, Utils.serialize(store));
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> store = Utils.unserialize(Utils.readFile(this.path));

        if (store.get(key) == null) {
            return defaultValue;
        } else {
            return store.get(key);
        }
    }

    @Override
    public Map<String, String> toMap() {
        return Utils.unserialize(Utils.readFile(this.path));
    }
}
// END
