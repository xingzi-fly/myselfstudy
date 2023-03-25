package learn001.test007reflect;

import org.junit.Test;

public class Field {

    @Test
    public void getDeclaredFields(){
        Class c = Student.class;
        java.lang.reflect.Field[] fields = c.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            System.out.println(field.getName()+"=====>"+field.getType());
        }

    }

    @Test
    public void getDeclaredField() throws NoSuchFieldException {
        Class c = Student.class;
        java.lang.reflect.Field field = c.getDeclaredField("age");
        System.out.println(field.getName()+"=====>"+field.getType());
    }

    @Test
    public void setField() throws NoSuchFieldException, IllegalAccessException {
        Class c = Student.class;

        java.lang.reflect.Field ageF = c.getDeclaredField("age");

        ageF.setAccessible(true);

        Student s = new Student();
        ageF.set(s,18);
        System.out.println(s);

        int age = (int) ageF.get(s);
        System.out.println(age);
    }
}
