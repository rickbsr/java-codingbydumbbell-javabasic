package db.cstmt;

import java.sql.*;
import static db.DatabaseInfo.*;

/**
 * delimiter $$
 * CREATE DEFINER=`remote`@`%` PROCEDURE `sp_select_members_by_sex`(in _sex varchar(10) CHARACTER set "utf8")
 * BEGIN
 * 	select * from members where sex = _sex;
 * END$$
 */
public class QueryCallableStatement_IN {
    public static void main(String[] args) {
        String sql = "CALL `orders`.`sp_select_members_by_sex`(?)";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                CallableStatement cstmt = conn.prepareCall(sql)
        ) {
            cstmt.setString(1, "M");
            ResultSet data = cstmt.executeQuery();
            while (data.next()) {
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