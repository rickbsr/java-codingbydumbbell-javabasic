package db.pstmt;

import java.sql.*;
import static db.DatabaseInfo.*;

public class QueryByPreparedStatement {
    public static void main(String[] args) {
        // SELECT * FROM orders.members WHERE SEX = 'F'
        String sql = "SELECT * FROM orders.members WHERE SEX = ?";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, "F");
            ResultSet data = pstmt.executeQuery();
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
