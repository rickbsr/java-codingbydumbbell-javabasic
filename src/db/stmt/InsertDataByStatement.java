package db.stmt;

import java.sql.*;
import static db.DatabaseInfo.*;

public class InsertDataByStatement {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                Statement stmt = conn.createStatement()
        ) {
            // INSERT INTO `orders`.`members` (`ID`, `NAME`, `SEX`, `EMAIL`) VALUES ('1', 'Jane', 'F', 'xxx@xxx.xx');
            String sql = "INSERT INTO `orders`.`members` (`ID`, `NAME`, `SEX`, `EMAIL`) VALUES (%s, %s, %s, %s);";
            String _id = "\'1\'";
            String _name = "\'Jane\'";
            String _sex = "\'F\'";
            String _email = "\'xxx@xxx.xx\'";
            sql = String.format(sql, _id, _name, _sex, _email);
            int resultCount = stmt.executeUpdate(sql);
            System.out.println(resultCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
