package swu.ml.design;

import java.sql.SQLException;

public class Examine {
    public static String check(String users,String pwd) throws SQLException {
        String sql="SELECT * FROM users_examine WHERE users='"+users+"';";
        String pwd_return = DBUtils.getPwd(sql);
        System.out.println("return:"+pwd_return);
        System.out.println("输入的密码："+pwd);
        String examine ;
        System.out.println(pwd_return);
        System.out.println(pwd);
        if(pwd.equals(pwd_return))
        {
            System.out.println("查询成功！");
            examine="登录成功! 你好"+users+"!";
        }
        else{
            System.out.println("查询失败！");
            examine ="登录失败！";
        }
        return examine;

    }
}
