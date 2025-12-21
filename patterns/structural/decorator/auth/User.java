package structural.decorator.auth;

public class User {

    private final Role role;

    public User(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}
