package learn001.test005net;


import java.io.IOException;
import java.net.*;
import java.util.Scanner;

//服务端、发送端
public class Server {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket();

        /**
         * 参数一：封装发送的数据
         * 参数二：发送数据的大小
         * 参数三：服务端的IP地址
         * 参数四：服务器的端口
         */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要发送的消息");
            String msg = sc.nextLine();

            if("exit".equals(msg)){
                System.out.println("离线成功！");
                socket.close();
                break;
            }
            byte[] buffer = msg.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),8888);

            socket.send(packet);
        }


    }
}
