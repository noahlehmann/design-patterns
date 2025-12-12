package creational.builder;

import creational.builder.k8s.common.Annotations;
import creational.builder.k8s.common.Labels;
import creational.builder.k8s.common.MetaData;
import creational.builder.k8s.pod.Pod;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Pod.Builder()
                        .apiVersion("v1")
                        .kind("Pod")
                        .metadata(
                                new MetaData.Builder()
                                        .name("example")
                                        .annotations(
                                                new Annotations()
                                                        .withAnnotation("prometheus.scrape", "true")
                                        )
                                        .labels(
                                                new Labels()
                                                        .withLabel("app.kubernetes.io/name", "example")
                                                        .withLabel("app.kubernetes.io/version", "1.0.0")
                                        )
                                        .build()
                        )
                        .build()
        );
    }
}
