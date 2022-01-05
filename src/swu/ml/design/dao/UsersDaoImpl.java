package swu.ml.design.dao;

import swu.ml.design.utils.DBUtils;

import java.sql.SQLException;

public class UsersDaoImpl implements UsersDao{
    @Override
    public String getPwd(String users) throws SQLException {
        String sql="SELECT * FROM user_info WHERE users='"+users+"';";
        String pwd= DBUtils.getPwd(sql);
        return pwd;
    }
}
