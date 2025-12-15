package creational.dependencyinjection;

import creational.dependencyinjection.container.Container;

public class Main {
    public static void main(String[] args) {
        Container c = new Container();
        Greeter g = c.get(Greeter.class, "spanish");
        g.greet();
        g = c.get(Greeter.class);
        g.greet();
    }
}
