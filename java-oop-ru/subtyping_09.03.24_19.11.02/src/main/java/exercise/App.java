package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage store) {
        store.toMap().forEach((k, v) -> {
            store.set(v, k);
            store.unset(k);
        });
    }
}
// END
