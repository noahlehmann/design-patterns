package structural.proxy;

import structural.proxy.user.IUserService;
import structural.proxy.user.LoggingUserServiceProxy;
import structural.proxy.user.RealUserService;

public class Main {
    public static void main(String[] args) {
        IUserService service = new LoggingUserServiceProxy(new RealUserService());

        service.deleteUser("alice");
    }
}
