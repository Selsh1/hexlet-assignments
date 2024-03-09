package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> store;

    public InMemoryKV(Map<String, String> map) {
        this.store = map;
    }

    /**
     * добавляет в словарь новое значение по указанному ключу
     * (или меняет значение, если ключ уже существует).
     * @param key
     * @param value
     */
    @Override
    public void set(String key, String value) {
        store = Map.copyOf(Map.of(key, value));
    }

    /**
     * удаляет из словаря значение по переданному ключу
     * @param key
     */
    @Override
    public void unset(String key) {
        this.store.remove(key);
    }

    /**
     * возвращает значение по указанному ключу. Если такого
     * ключа в словаре нет, возвращает значение по умолчанию.
     * @param key
     * @param defaultValue
     * @return
     */
    @Override
    public String get(String key, String defaultValue) {
        return this.store.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return this.store;
    }
}
// END
