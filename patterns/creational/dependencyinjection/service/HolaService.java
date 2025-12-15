package creational.dependencyinjection.service;

import creational.dependencyinjection.container.Service;

@Service("spanish")
public class HolaService implements IMessageService {
    public String message() {
        return "Hola DI";
    }
}
