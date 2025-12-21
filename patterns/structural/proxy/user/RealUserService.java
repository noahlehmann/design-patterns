package structural.proxy.user;

public class RealUserService implements IUserService {
    @Override
    public void deleteUser(String username) {
        System.out.println("User deleted: " + username);
    }
}
