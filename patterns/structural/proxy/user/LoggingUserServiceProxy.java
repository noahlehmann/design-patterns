package structural.proxy.user;

public class LoggingUserServiceProxy implements IUserService {
    private final IUserService target;

    public LoggingUserServiceProxy(IUserService target) {
        this.target = target;
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("DELETE /users/" + username);
        target.deleteUser(username);
    }
}
