package db.cstmt;

import java.sql.*;
import static db.DatabaseInfo.*;

/**
 * delimiter $$
 * CREATE DEFINER=`remote`@`%` PROCEDURE `sp_insert_members`(in _name varchar(10) CHARACTER set "utf8"
 * 																			,in _sex varchar(1) CHARACTER set "utf8"
 *                                                                             ,in _email varchar(60) CHARACTER set "utf8"
 *                                                                             ,out _result varchar(100) CHARACTER set "utf8"
 *                                                                             )
 * BEGIN
 * 	insert into members(`NAME`,`SEX`,`EMAIL`) values(_name,_sex,_email);
 * 	set _result := "操作成功!!";
 * END$$
 */

public class QueryCallableStatement_IN_OUT {
    public static void main(String[] args) {
        String sql = "CALL sp_insert_members(?,?,?,?);";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                CallableStatement cstmt = conn.prepareCall(sql)
        ) {
            cstmt.setString(1, "Jacky");
            cstmt.setString(2, "M");
            cstmt.setString(3, "xxx@xxx.xx");
            cstmt.registerOutParameter(4, Types.VARCHAR);
            cstmt.execute();

            String outParam = cstmt.getString(4);
            System.out.println(outParam);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
