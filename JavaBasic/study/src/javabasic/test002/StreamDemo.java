package learn001.test002;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class StreamDemo {

    public static double allmoney;
    public static double twomoney;

    public static void main(String[] args) {

        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒",'男',30000 , 25000, null));
        one.add(new Employee("孙悟空",'男',25000 , 1000, "顶撞上司"));
        one.add(new Employee("沙僧",'男',20000 , 20000, null));
        one.add(new Employee("小白龙",'男',20000 , 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松",'男',15000 , 9000, null));
        two.add(new Employee("李逵",'男',20000 , 10000, null));
        two.add(new Employee("西门庆",'男',50000 , 100000, "被打"));
        two.add(new Employee("潘金莲",'女',3500 , 1000, "被打"));
        two.add(new Employee("武大郎",'女',20000 , 0, "下毒"));

        //最高工资
        Top t = one.stream().max((e1,e2)->Double.compare(e1.getSalary()+e1.getBonus() , e2.getSalary()+e2.getBonus()))
                .map(e->new Top(e.getName(),e.getSalary()+e.getBonus())).get();

        System.out.println(t);


        one.stream().sorted((e1,e2)->Double.compare(e1.getSalary()+e1.getBonus() , e2.getSalary()+e2.getBonus()))
                .skip(1).limit(one.size()-2).forEach(e->{
                    allmoney+=(e.getSalary()+e.getBonus());
                });
        System.out.println(allmoney/(one.size()-2));

        Stream<Employee> s1 = one.stream();
        Stream<Employee> s2 = two.stream();

        Stream<Employee> sum = Stream.concat(s1,s2);
        sum.sorted((e1,e2)->Double.compare(e1.getSalary()+e1.getBonus() , e2.getSalary()+e2.getBonus()))
                .skip(1).limit(one.size()+two.size()-2).forEach(e->{
                    twomoney+=(e.getSalary()+e.getBonus());
                });
        BigDecimal a = BigDecimal.valueOf(twomoney);
        BigDecimal b = BigDecimal.valueOf(one.size()+two.size()-2);

        System.out.println(a.divide(b,2, RoundingMode.HALF_UP));
    }
}
