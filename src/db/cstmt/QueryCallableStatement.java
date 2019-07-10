package db.cstmt;

import java.sql.*;
import static db.DatabaseInfo.*;

/**
 * CREATE DEFINER=`remote`@`%` PROCEDURE `sp_select_members`()
 * BEGIN
 * 	select * from members;
 * END
 */
public class QueryCallableStatement {
    public static void main(String[] args) {
        String sql = "CALL `orders`.`sp_select_members`();";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                CallableStatement cstmt = conn.prepareCall(sql)
        ) {
            ResultSet data = cstmt.executeQuery();
            while (data.next()){
                System.out.print("Id: " + data.getInt("ID") + "\t" +
                        "Name: " + data.getString("NAME") + "\t\t" +
                        "Gender: " + data.getString("SEX") + "\t\t" +
                        "Email: " + data.getString("EMAIL") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
