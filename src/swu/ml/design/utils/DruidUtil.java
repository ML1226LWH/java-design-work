package swu.ml.design.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DruidUtil {
    private static DataSource ds;

    static {
        //加载配置文件和建立连接池
        try {
            Properties pro = new Properties();
            InputStream resourceAsStream = DruidUtil.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(resourceAsStream);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接池
     * @return
     */
    public static DataSource getDataSource(){
        return ds;
    }


    /**
     * 获取连接池中的一个连接
     * @return
     * @throws SQLException
     */
    public Connection getconnection() throws SQLException {
        return ds.getConnection();

    }


    /**
     * 关闭数据库的资源  三个对象都存在时
     * @param conn
     * @param res
     * @param pstmt
     */
    public static void close(Connection conn, ResultSet res, PreparedStatement pstmt){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (res!=null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭数据库的连接（只存在Connection和PreparedStatement对象时）
     * @param conn
     * @param pstmt
     */
    public void close(Connection conn,PreparedStatement pstmt){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

