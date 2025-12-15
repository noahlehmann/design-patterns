package creational.dependencyinjection.service;

import creational.dependencyinjection.container.Service;

@Service("english")
public class HelloService implements IMessageService {
    public String message() {
        return "Hello DI";
    }
}
