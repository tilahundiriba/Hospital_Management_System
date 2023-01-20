
package com.tilish1424;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String USERNAME = "JAVADB20233";
    private static final String PASSWORD = "1424";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    public Connection get_connection() {

        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME, PASSWORD );
             if (connection != null) {
            System.out.println("Connected database successfully...");
        } else {
          System.out.println("nFailed to connect to Oracle DB");
        }
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
    
}
