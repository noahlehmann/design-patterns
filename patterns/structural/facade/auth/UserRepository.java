package structural.facade.auth;

public class UserRepository {
    public boolean exists(String user) {
        return "admin".equals(user);
    }
}
