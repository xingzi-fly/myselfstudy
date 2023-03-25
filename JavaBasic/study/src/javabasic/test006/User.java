package learn001.test006;

public class User {
    public String loginName(String loginName,String password){
        if("admin".equals(loginName)&&"123456".equals(password)){
            return "登录成功";
        }else{
            return "用户名或密码错误";
        }
    }

    public void select(){
        System.out.println(10/0);
        System.out.println("查询成功");
    }
}
