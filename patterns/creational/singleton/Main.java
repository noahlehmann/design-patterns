package creational.singleton;

import creational.singleton.config.ConfigurationManager;

public class Main {
    public static void main(String[] args) {
        var config = ConfigurationManager.getInstance();
        System.out.printf(
                "Connecting via %s with user %s and password %s%n",
                config.getJdbcUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }
}
