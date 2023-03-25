package learn001.test007reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Methodaa {

    @Test
    public void getDeclaredMethods(){
        Class c = Dog.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"  "+method.getReturnType()+"  "+method.getParameterCount());
        }
    }

    @Test
    public void getDeclaredMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = Dog.class;
        Method m1 = c.getDeclaredMethod("eat");
        Method m2 = c.getDeclaredMethod("eat",String.class);
        System.out.println(m1.getName()+"  "+m1.getReturnType()+"  "+m1.getParameterCount());
        System.out.println(m2.getName()+"  "+m2.getReturnType()+"  "+m2.getParameterCount());

        m1.setAccessible(true);
        m2.setAccessible(true);

        Dog d = new Dog();
        Object result = m1.invoke(d);
        System.out.println(result);

        Object result2 = m2.invoke(d,"小鸡");
        System.out.println(result2);
    }

}
