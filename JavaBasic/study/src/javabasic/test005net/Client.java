package learn001.test005net;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//客户端、接收端
public class Client {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            socket.receive(packet);

            int len = packet.getLength();
            String rs = new String(buffer,0,len);
            System.out.println("收到了来自"+packet.getAddress()+",端口是"+packet.getPort()+"的消息："+rs);


        }




    }

}
