package learn001.test007reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class test001 {


    //=============================================

    @Test
    public void getDeclaredConstructor() throws Exception {
        Class c = Student.class;

        Constructor con = c.getDeclaredConstructor();
        System.out.println(con.getName()+"========>"+con.getParameterCount());

        con.setAccessible(true);

        Student s = (Student) con.newInstance();
        System.out.println(s);

        Constructor cons1 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(cons1.getName()+"========>"+cons1.getParameterCount());
        Student s1 = (Student)  cons1.newInstance("wjy",10);
        System.out.println(s1);


    }


}

