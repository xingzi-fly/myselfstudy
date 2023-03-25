package learn001.test001;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        ArrayList<Goods> goods = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("0.退出");


            System.out.println("请选择操作：");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    login(goods, sc);
                    break;
                case 2:
                    register(goods, sc);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }


    }

    private static void login(ArrayList<Goods> goods, Scanner sc) {

        if (goods.size() == 0) {
            System.out.println("请先注册");
            return;
        }

        while (true) {
            System.out.println("请输入账号和密码");

            String ss = sc.next();
            Goods g = getcard(ss, goods);
            if (g == null) {
                System.out.println("卡号不存在");
            } else {
                while (true) {
                    String pwd = sc.next();
                    if (g.getUpwd().equals(pwd)) {
                        System.out.println("成功了，" + g.getUname());
                        show(g,goods);
                        return;
                    } else {
                        System.out.println("密码错误");
                    }
                }
            }
        }


    }

    private static void show(Goods g,ArrayList<Goods> goods) {
        while (true) {
            System.out.println("===========================");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.改密");
            System.out.println("6.退出");
            System.out.println("7.注销");

            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    showz(g);
                    break;
                case 2:
                    cun(g,sc);
                    break;
                case 3:
                    qu(g,sc);
                    break;
                case 4:
                    trans(g,sc,goods);
                    break;
                case 5:
                    xiu(g,sc);
                    return;
                case 6:
                    System.out.println("exit");
                    return;
                case 7:
                    goods.remove(g);
                    return;


            }
        }


    }

    private static void xiu(Goods g, Scanner sc) {
        String ss = sc.next();
        g.setUpwd(ss);
        return;
    }


    private static void trans(Goods g, Scanner sc, ArrayList<Goods> goods) {
        if(goods.size()<2) {
            return;
        }
        if(g.getMoney()==0){
            return;
        }

        System.out.println("对方号");

        while (true) {
            String cid = sc.next();
            Goods gg = getcard(cid, goods);

            if(cid.equals(g.getCid())){
                System.out.println("自己的不行");
                continue;
            }

            if(gg==null){
                System.out.println("不存在");
            }else{
                double money = sc.nextDouble();
                g.setMoney(g.getMoney()-money);
                gg.setMoney(gg.getMoney()+money);
                System.out.println("转账成功");
                return;
            }

        }

    }

    private static void qu(Goods g, Scanner sc) {
        double money = sc.nextDouble();

        if(g.getMoney()>money&&g.getMoney()>100&&g.getEd()>money){
            g.setMoney(g.getMoney()-money);
            System.out.println("成功了");
            System.out.println(g.getMoney());
            return;
        }else{
            System.out.println("没钱");
            return;
        }

    }

    private static void cun(Goods g,Scanner sc) {
        double money = sc.nextDouble();

        g.setMoney(g.getMoney()+money);

    }

    private static void showz(Goods g) {
        System.out.println(g.getCid()+" "+g.getUname()+" "+g.getMoney()+" "+g.getEd());
    }

    private static void register(ArrayList<Goods> goods, Scanner sc) {
        System.out.println("=========================");
        System.out.println("开户");

        Goods g1 = new Goods();

        String s1 = sc.next();
        g1.setUname(s1);

        while (true) {
            String pwd1 = sc.next();
            String pwd2 = sc.next();

            if (pwd2.equals(pwd1)) {
                g1.setUpwd(pwd2);
                System.out.println("成功");
                break;
            } else {
                System.out.println("密码不一致");
            }
        }

        double ed = sc.nextDouble();
        g1.setEd(ed);

        g1.setMoney(0.0);

        String cid = getid(goods);
        g1.setCid(cid);

        goods.add(g1);

        System.out.println("恭喜" + g1.getUname() + "成功," + "卡号是" + g1.getCid());

    }

    private static String getid(ArrayList<Goods> goods) {
        String cid = "";
        Random r = new Random();
        while (true) {
            for (int i = 0; i < 8; i++) {
                cid += r.nextInt(10);
            }

            Goods g = getcard(cid, goods);
            if (g == null) {
                return cid;
            }
        }

    }

    private static Goods getcard(String cid, ArrayList<Goods> goods) {
        for (int i = 0; i < goods.size(); i++) {
            Goods g1 = goods.get(i);

            if (g1.getCid().equals(cid)) {
                return g1;
            }
        }
        return null;

    }


}
