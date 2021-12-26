package swu.ml.design;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    private static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/travel";
    private static String DB_USER = "root";
    private static String DB_PASS = "qwe12345";

    public static void checkUsers(String sql) throws SQLException {
        excute(sql);
    }
    public static void insert(String sql) throws SQLException {
        excute(sql);
    }
    public static void update(String sql) throws SQLException {
        excute(sql);
    }

    private static void excute(String sql) throws SQLException {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
            }
        }
    }

    public static String getPwd(String sql) {
        try {
            Class.forName(DB_DRIVER);
            System.out.println("已连接");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            try (Statement statement = connection.createStatement()) {
                System.out.println("连接中……");
                ResultSet rs = statement.executeQuery(sql);
                System.out.println("sql2:"+sql);
                while (rs.next()) {
                    String pwd_return = rs.getString("password");
                    System.out.println(pwd_return);
                    return pwd_return;
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public static List<Destination> getDestinations(String sql) throws SQLException {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Destination> destinations = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            try (Statement statement = connection.createStatement()) {
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    Destination destination = new Destination();
                    destination.setId(rs.getInt("id"));
                    destination.setPlace(rs.getString("place"));
                    destination.setDescribe(rs.getString("describe"));
                    destination.setImg(rs.getString("img"));
                    destinations.add(destination);
                }
            }
        }

        return destinations;
    }
    public static Destination getDestination(String sql) throws SQLException {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Destination destination = new Destination();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            try (Statement statement = connection.createStatement()) {
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {

                    destination.setId(rs.getInt("id"));
                    destination.setPlace(rs.getString("place"));
                    destination.setDescribe(rs.getString("describe"));
                    destination.setImg(rs.getString("img"));
                }
            }
        }

        return destination;
    }


}
