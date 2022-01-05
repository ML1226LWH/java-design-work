package swu.ml.design.service;

import java.sql.SQLException;

public interface UsersService {
    String check(String users,String pwd) throws SQLException;
}
