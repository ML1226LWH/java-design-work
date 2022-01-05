package swu.ml.design.dao;

import java.sql.SQLException;

public interface UsersDao {
    String getPwd(String users) throws SQLException;
}
