package learn001.test002;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class learn001 {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        });

        long size = list.stream().filter(s->s.length()==3).count();
        System.out.println(size);
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        System.out.println("==========================================");
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s-> System.out.println(s));
        System.out.println("==========================================");
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach( System.out::println);
        System.out.println("==========================================");
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public  String apply(String s){
//                return  "武当"+s;
//            }
//        });
        list.stream().map(s->"武当"+s).forEach(System.out::println);
        //加工学生对象
        //list.stream().map(s->new Student(s)).forEach(s-> System.out.println(s));
        //list.stream().map(Student::new).forEach(System.out::println);
        System.out.println("==========================================");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1","Java2");
        Stream<String> sum = Stream.concat(s1,s2);
        sum.distinct().forEach(s -> System.out.println(s));

    }
}
