package jdbc.config;

public class DBConfig {
    private static DBConfig instance;
    private static String url;
    private static String username;
    private static  String password;

    private DBConfig() {
        DBConfig.url = "jdbc:mysql://localhost:3306/my_school";
        DBConfig.username = "root";
        DBConfig.password = "1234";
    }

    public static DBConfig getInstance(){
        if (instance == null){
            instance = new DBConfig();
        }
        return instance;
    }

    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
