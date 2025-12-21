package structural.facade.auth;

public class PasswordService {
    public boolean check(String user, String password) {
        return "secret".equals(password);
    }
}
