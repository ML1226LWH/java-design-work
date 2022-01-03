package swu.ml.design.utils;

import swu.ml.design.Destination;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    public DBUtils() throws SQLException {
    }

    public static void checkUsers(String sql) throws SQLException {

        excute(sql);
    }
    public static void insert(String sql) throws SQLException {

        excute(sql);
    }
    public static void update(String sql) throws SQLException {
        excute(sql);
    }
    public static void delete(String sql) throws SQLException {
        excute(sql);
    }

    private static void excute(String sql) throws SQLException {
        DataSource dataSource = DruidUtil.getDataSource();
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

    }

    public static String getPwd(String sql) throws SQLException {
        DataSource dataSource = DruidUtil.getDataSource();
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);
        while (resultSet.next()) {
            String pwd_return = resultSet.getString("password");
            System.out.println(pwd_return);
            return pwd_return;
        }
        return null;
    }
    public static List<Destination> getDestinations(String sql) throws SQLException {
        List<Destination> destinations = new ArrayList<>();
        DataSource dataSource = DruidUtil.getDataSource();
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery(sql);
                while (rs.next()) {
                    Destination destination = new Destination();
                    destination.setId(rs.getInt("id"));
                    destination.setPlace(rs.getString("place"));
                    destination.setDescribe(rs.getString("describe"));
                    destination.setImg(rs.getString("img"));
                    destinations.add(destination);
                }
            return destinations;

    }
}
