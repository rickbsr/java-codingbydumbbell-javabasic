package db.stmt;

import java.sql.*;
import static db.DatabaseInfo.*;

public class CreateTable {

    public static void main(String[] args) {
        try (
                // 建立 Connection
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                // 建立 Statement
                Statement stmt = conn.createStatement()
        ) {
            Class.forName(DB_DRIVER); // JDBC 4.0 以後可以省略
            String sql = "CREATE TABLE orders.members ( " +
                    "ID INTEGER not null primary key, " +
                    "NAME VARCHAR(10), " +
                    "SEX VARCHAR(1), " +
                    "EMAIL VARCHAR(60) )";
            // 將建立資料表的 SQL 語句送至 Statement 物件
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
