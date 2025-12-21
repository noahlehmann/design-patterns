package structural.facade;

public class Main {
    public static void main(String[] args) {
        LoginFacade login = new LoginFacade();
        System.out.println(login.login("admin", "secret"));
    }
}
