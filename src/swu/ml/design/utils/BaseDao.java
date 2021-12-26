package swu.ml.design.utils;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author 太好听了吧
 * @version 1.0
 * @Description TODO
 * @Date 2021/12/24 20:52
 */
public class BaseDao {

    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/travel";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "qwe12345";

    private static Connection conn = null;

    static {
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String sql) {
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            return statement.executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void execute(String sql) {
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            int i = statement.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
