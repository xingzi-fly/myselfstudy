package learn001.test008annotation;

public class Test {
    public static void main(String[] args) {
        UserService u1= new UserServiceImp();
        UserService u2 = ProxyUtil.getProxy(u1);
        u2.login("admin","123456");
        u2.deleteUser();
        u2.selectUser();
    }
}
