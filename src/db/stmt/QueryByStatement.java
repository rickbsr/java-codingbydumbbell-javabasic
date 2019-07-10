package db.stmt;

import java.sql.*;
import static db.DatabaseInfo.*;

public class QueryByStatement {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                Statement stmt = conn.createStatement()
        ) {
            // SELECT * FROM orders.members WHERE SEX = 'M'
            String sql = "SELECT * FROM orders.members WHERE SEX = %s";
            String sex = "\'M\'";
            sql = String.format(sql, sex);
            ResultSet data = stmt.executeQuery(sql);
            while (data.next()) {
                System.out.print("Id: " + data.getInt("ID") + "\t" +
                        "Name: " + data.getString("NAME") + "\t" +
                        "Gender: " + data.getString("SEX") + "\t" +
                        "Email: " + data.getString("EMAIL") + "\n"); }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
