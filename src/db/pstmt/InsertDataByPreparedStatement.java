package db.pstmt;

import java.sql.*;
import static db.DatabaseInfo.*;

public class InsertDataByPreparedStatement {
    public static void main(String[] args) {
        // INSERT INTO `orders`.`members` (`ID`, `NAME`, `SEX`, `EMAIL`) VALUES ('2', 'Rick', 'M', 'xxx@xxx.xx');
        String sql = "INSERT INTO `orders`.`members` (`ID`, `NAME`, `SEX`, `EMAIL`) VALUES (?, ?, ?, ?);";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Rick");
            pstmt.setString(3, "M");
            pstmt.setString(4, "xxx@xxx.xx");
            int resultCount = pstmt.executeUpdate();
            System.out.println(resultCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}