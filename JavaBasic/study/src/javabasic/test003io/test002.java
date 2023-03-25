package learn001.test003io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class test002 {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.setProperty("admin","123456");
//        properties.setProperty("lilei","111111");
//
//        //参数二comments可省略
//        properties.store(new FileWriter("./src/learn001/test003io/txt004.properties"),"this is users");

        Properties properties = new Properties();
        properties.load(new FileReader("./src/learn001/test003io/txt004.properties"));
        System.out.println(properties);

        String rs = properties.getProperty("admin");
        System.out.println(rs);



    }
}
