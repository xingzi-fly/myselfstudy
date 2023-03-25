package learn001.test001;
import java.util.Scanner;
import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        String ss = yzm2(nn);
        System.out.println(ss);

    }

    public static String yzm1(int n) {
        String ss = "";
        Random rr = new Random();
        for (int i = 0; i < n; i++) {
            int type = rr.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char) (rr.nextInt(26) + 65);
                    ss += ch;
                    break;
                case 1:
                    ch = (char) (rr.nextInt(26) + 97);
                    ss += ch;
                    break;
                case 2:
                    ch = (char) (rr.nextInt(10)+48);
                    ss += ch;
                    break;
            }


        }
        return ss;

    }

    public static String yzm2(int n){
        String datas = "qwertyuiopasdfghjklzxcvbnm123456789QWERTYUIOPASLKJDHFGZXCVBNM";
        String code="";


        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int in = r.nextInt(datas.length());
            char c=datas.charAt(in);
            code+=c;

        }
        return code;
    }
}
