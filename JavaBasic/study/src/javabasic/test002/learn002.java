package learn001.test002;

import java.util.*;

public class learn002 {
    public static void main(String[] args) {

        Map<Student,String> sets = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        Student s1 = new Student("qq",20,'m');
        Student s2 = new Student("aa",10,'f');
        Student s3 = new Student("zz",25,'m');
        Student s4 = new Student("zz",25,'m');

        sets.put(s1,"shanghai");
        sets.put(s2,"beijing");
        sets.put(s3,"guangzhou");
        sets.put(s3,"zhuzhou");

        System.out.println(sets);
    }
}
