package creational.dependencyinjection;

import creational.dependencyinjection.container.Inject;
import creational.dependencyinjection.service.IMessageService;

public class Greeter {

    @Inject
    private IMessageService service;

    public void greet() {
        System.out.println(service.message());
    }
}
