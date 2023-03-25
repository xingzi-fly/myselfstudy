package learn001.test008annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})         //元注解
@Retention(RetentionPolicy.RUNTIME)                     //一直存在

public @interface MyTest {

}
