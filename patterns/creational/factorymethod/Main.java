package creational.factorymethod;

import creational.factorymethod.creator.EmailCreator;
import creational.factorymethod.creator.PushCreator;
import creational.factorymethod.creator.RcsCreator;

public class Main {
    public static void main(String[] args) {
        Creator creator;

        creator = new EmailCreator();
        creator.notifyUser("Your order has shipped!");

        creator = new RcsCreator();
        creator.notifyUser("Your package is out for delivery.");

        creator = new PushCreator();
        creator.notifyUser("Your package was delivered!");
    }
}
