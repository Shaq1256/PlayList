package playlist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;
    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "playlista_user");
        connectionProps.put("password", "playlista_password");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/playlista?serverTimezone=Europe/Warsaw" +
                                "&useSSL=False", connectionProps);
    }
    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }
    public Connection getConnection() {
        return conn;
    }
}
