package swu.ml.design.utils;

import swu.ml.design.domain.Destination;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBUtils {


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
        Connection connection = DruidUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int i = preparedStatement.executeUpdate();
        if(i>0)
        {
            System.out.println("success!");
        }
        DruidUtil.close(connection,null,preparedStatement);

    }

    public static String getPwd(String sql) throws SQLException {
        DataSource dataSource = DruidUtil.getDataSource();
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);
        while (resultSet.next()) {
            String pwd_return = resultSet.getString("password");
            return pwd_return;
        }
        DruidUtil.close(connection,resultSet,preparedStatement);
        return null;
    }
    public static List<Destination> getDestinations(String sql) throws SQLException {
        List<Destination> destinations = new ArrayList<>();
        Connection connection = DruidUtil.getConnection();
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
        DruidUtil.close(connection,rs,preparedStatement);
        return destinations;

    }
}
