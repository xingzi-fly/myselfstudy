package javaweb.test001Mysql;

import java.sql.*;

public class test001 {
    public static void main(String[] args) throws Exception {

        //Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db1";
        String username="root";
        String password = "1234";
        Connection conn=DriverManager.getConnection(url,username,password);

        String sql1 = "select * from account";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql1);

        while(rs.next()){
            int i =rs.getInt(1);
            String name = rs.getString(2);
            double money = rs.getDouble(3);
            System.out.println(i+"="+name+"="+money);
        }

        rs.close();
        stmt.close();
        conn.close();

    }

}
