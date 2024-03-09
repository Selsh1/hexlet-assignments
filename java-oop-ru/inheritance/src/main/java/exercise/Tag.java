package exercise;

import java.util.LinkedList;
import java.util.Map;

// BEGIN
public abstract class Tag {
    protected String tag;
    private Map<String, String> attributes;

    public Tag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    public String toString() {
        LinkedList<String> attributes = new LinkedList<String>();

        for (String key : this.attributes.keySet()) {
            attributes.add(String.format("%s=\"%s\"", key, this.attributes.get(key)));
        }

        attributes.addFirst(this.tag);

        return String.format("<%s>", String.join(" ", attributes));
    }
}
// END
