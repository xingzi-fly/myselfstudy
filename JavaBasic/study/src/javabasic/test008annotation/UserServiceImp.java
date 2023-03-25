package learn001.test008annotation;

public class UserServiceImp implements UserService{

    @Override
    public String login(String loginName, String passWord) {
        long startTime = System.currentTimeMillis();
        String rs = "登录失败";
        if("admin".equals(loginName)&&"123456".equals(passWord)){
            rs = "登录成功";
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("login方法耗时为"+(endTime-startTime)/1000.0+"s");
        return rs;
    }

    @Override
    public void deleteUser() {
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("delete方法耗时为"+(endTime-startTime)/1000.0+"s");
    }

    @Override
    public String selectUser() {
        long startTime = System.currentTimeMillis();
        String rs = "查询10000个数据";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("select方法耗时为"+(endTime-startTime)/1000.0+"s");
        return rs;
    }
}
