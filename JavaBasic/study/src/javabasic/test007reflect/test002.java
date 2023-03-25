package learn001.test007reflect;

public class test002 {
    public static void main(String[] args) {

        Student s = new Student("小狗",'男',15,"军犬一班","吃骨头");
        MyUtil.save(s);

        Teacher t = new Teacher("金毛",'男',2500);
        MyUtil.save(t);
    }
}
