package learn001.test008annotation;

public interface UserService {
    String login(String loginName,String passWord);
    void deleteUser();
    String selectUser();
}
