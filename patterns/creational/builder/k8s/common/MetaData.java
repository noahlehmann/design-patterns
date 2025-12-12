package creational.builder.k8s.common;

public class MetaData {

    private String name;
    private String namespace = "default";
    private Annotations annotations;
    private Labels labels;

    private MetaData(String name, String namespace, Annotations annotations, Labels labels) {
        this.name = name;
        this.namespace = namespace;
        this.annotations = annotations;
        this.labels = labels;
    }

    public static class Builder {
        private String name;
        private String namespace = "default";
        private Annotations annotations;
        private Labels labels;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder annotations(Annotations annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder labels(Labels labels) {
            this.labels = labels;
            return this;
        }

        public MetaData build() {
            return new MetaData(name, namespace, annotations, labels);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  name: ").append(name).append("\n");
        sb.append("  namespace: ").append(namespace).append("\n");
        sb.append("  annotations:").append(annotations == null ? "null" : annotations.toString()).append("\n");
        sb.append("  labels:").append(labels == null ? "null" : labels.toString()).append("\n");
        return sb.toString();
    }

}
