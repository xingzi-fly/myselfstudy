package learn001.test008annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Anno {

    @MyTest
    public void test1(){
        System.out.println("====test1====");
    }

    public void test2(){
        System.out.println("====test2====");
    }

    @MyTest
    public void test3(){
        System.out.println("====test3====");
    }

    public void test4(){
        System.out.println("====test4====");
    }

    /*
            启动菜单
     */

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Anno t = new Anno();
        Class c = Anno.class;

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(t);
            }
        }

    }
}
