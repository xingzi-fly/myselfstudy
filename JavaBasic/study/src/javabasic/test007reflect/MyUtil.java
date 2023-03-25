package learn001.test007reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MyUtil {
    /*

     */
    public static void save(Object obj) {

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("./src/learn001/test007reflect/data.txt", true));

            //1.提取这个对象的全部成员变量：只有反射可以解决
            //*******  (c.getSimpleName()获取当前类名  c.getName()获取全限名：包名+类名)
            Class c = obj.getClass();
            ps.println("=========" + c.getSimpleName() + "=========");

            //2.提取它的全部成员变量
            Field[] fields = c.getDeclaredFields();

            //3.获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                //提取本成员变量在obj中的值

                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name+"="+value);

            }

            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

