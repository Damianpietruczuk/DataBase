import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
        public static void main(String[] args) throws SQLException {
            String url = "jdbc:sqlserver://DESKTOP-6LO90HK\\SQLEXPRESS;databaseName=DataBaseOne;integratedSecurity=true;";

            Connection conn = DriverManager.getConnection(url);
            System.out.println(conn);

//        Statement statement = conn.createStatement();
//        String sqlQuery= "Select * from Employees";
        }
}
