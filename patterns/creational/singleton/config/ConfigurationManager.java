package creational.singleton.config;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;
    private final String jdbcUrl;
    private final String username;
    private final String password;

    private ConfigurationManager() {
        // load config from file or server here...
        this.jdbcUrl = "jdbc:postgres://localhost:5432/db";
        this.username = "postgres";
        this.password = "postgres";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
