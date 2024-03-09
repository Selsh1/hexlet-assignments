package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> tags;

    public PairedTag(String tag, Map<String, String> attributes, String body, List<Tag> tags) {
        super(tag, attributes);

        this.body = body;
        this.tags = tags;
    }

    @Override
    public String toString() {
        ArrayList<String> tags = new ArrayList<String>();

        for (Tag tag : this.tags) {
            tags.add(tag.toString());
        }

        return super.toString() + this.body + String.join("", tags) + String.format("</%s>", this.tag);
    }
}
// END
