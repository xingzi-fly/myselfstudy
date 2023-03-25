package javaweb.test002;

import java.util.*;
import java.util.Iterator;

public class test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n=sc.nextInt();
        TreeSet sk1 = new TreeSet();
        for(int i=0;i<s.length();i++){
            for (int j=i;j<s.length()+1;j++){
                String kk =s.substring(i,j);
                sk1.add(kk);
            }
        }

        ArrayList<String> sk2 = new ArrayList<>();
        Iterator it = sk1.iterator();
        while(it.hasNext()){
            String a = (String)it.next();
            sk2.add(a);
        }

        System.out.println(sk2.get(n));

    }
}
