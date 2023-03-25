package learn001.test002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class learn003 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        Stream<String> sk1 = list.stream().filter(s->s.startsWith("张"));
        List<String> zhang1= sk1.collect(Collectors.toList());
        System.out.println(zhang1);

        Stream<String> sk2 = list.stream().filter(s->s.startsWith("张"));
        Set<String> zhang2 = sk2.collect(Collectors.toSet());
        System.out.println(zhang2);

        Stream<String> sk3 = list.stream().filter(s->s.startsWith("张"));
        Object[] zhang3 = sk3.toArray();
        System.out.println(Arrays.toString(zhang3));

    }
}
