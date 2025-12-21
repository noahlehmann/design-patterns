package structural.facade;

import structural.facade.auth.PasswordService;
import structural.facade.auth.TokenService;
import structural.facade.auth.UserRepository;

public class LoginFacade {
    private final UserRepository users = new UserRepository();
    private final PasswordService passwords = new PasswordService();
    private final TokenService tokens = new TokenService();

    public String login(String user, String password) {
        if (!users.exists(user)) return "401";
        if (!passwords.check(user, password)) return "401";
        return tokens.issueToken(user);
    }
}
