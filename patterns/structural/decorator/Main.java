package structural.decorator;

import structural.decorator.auth.Role;
import structural.decorator.auth.User;
import structural.decorator.router.Router;

public class Main {
    public static void main(String[] args) {
        User admin = new User(Role.ADMIN);
        User guest = new User(Role.USER);

        new Router(admin).handleRequest("doc-1");   // OK

        try {
            new Router(guest).handleRequest("doc-2");   // Exception
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}
