package swu.ml.design.service;

import swu.ml.design.dao.UsersDao;
import swu.ml.design.dao.UsersDaoImpl;
import swu.ml.design.utils.DBUtils;

import java.sql.SQLException;

public class UsersServiceImpl implements UsersService{
    private UsersDao usersDao=new UsersDaoImpl() ;
    @Override
    public String check(String users, String pwd) throws SQLException {

        String pwd_return = usersDao.getPwd(users);
        String examine ;
        if(pwd.equals(pwd_return))
        {
            System.out.println("密码核对成功");
            examine="登录成功"+users+"!";
        }
        else{
            System.out.println("密码核对失败");
            examine ="登录失败";
        }
        return examine;
    }
}
