package learn001.test005net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test005 {
    public static void main(String[] args) throws IOException {

        //1.获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //3.判断是否能连通
        System.out.println(ip2.isReachable(5000));

    }
}
