package creational.builder.k8s.pod;

import creational.builder.k8s.common.MetaData;

public class Pod {

    private String apiVersion;
    private String kind;
    private MetaData metadata;

    private Pod(String apiVersion, String kind, MetaData metadata) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
    }

    public static class Builder {
        private String apiVersion;
        private String kind;
        private MetaData metadata;

        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        public Builder metadata(MetaData metadata) {
            this.metadata = metadata;
            return this;
        }

        public Pod build() {
            return new Pod(apiVersion, kind, metadata);
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("apiVersion: ").append(apiVersion).append("\n");
        sb.append("kind: ").append(kind).append("\n");
        sb.append("metadata:\n");
        sb.append(metadata == null ? "null" : metadata.toString());
        sb.append("spec:\n  ...");
        return sb.toString();
    }
}
