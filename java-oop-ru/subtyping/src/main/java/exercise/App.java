package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        for (String key : storage.toMap().keySet()) {
            storage.set(storage.get(key, ""), key);
            storage.unset(key);
        }
    }
}
// END
