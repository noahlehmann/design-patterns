package creational.builder.k8s.common;

import java.util.HashMap;

public class Annotations extends HashMap<String, String> {

    public Annotations withAnnotation(String key, String value) {
        this.put(key, value);
        return this;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (var entry : entrySet()) {
            sb.append("\n    ").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        return sb.toString();
    }
}
