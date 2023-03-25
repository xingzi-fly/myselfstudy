package learn001.test008annotation;


import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Annotationtest {

    @Test
    public void parseClass(){
        Class c = BookStore.class;
        if(c.isAnnotationPresent(Book.class)){
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            //System.out.println(book.authors());
            System.out.println(Arrays.toString(book.authors()));
        }

    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c = BookStore.class;

        Method m = c.getDeclaredMethod("test");

        if(m.isAnnotationPresent(Book.class)){
            Book book = (Book) m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }

    }
}


@Book(value = "《舔狗日记》",price = 15.2,authors = {"金毛","泰迪"})

class BookStore{

    @Book(value = "<我的收藏>",price = 18.5,authors = {"爱帅","长达"})
    public void test(){

    }

}
