package learn001.test005net;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Clienttcp {
    public static void main(String[] args) throws IOException {

        //参数一：客户端的IP地址
        //参数二：客户端的端口
        Socket socket = new Socket("192.168.152.1",6666);

        new ClientThread(socket).start();

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入消息");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("结束了");
                break;
            }

            ps.println(msg);
            ps.flush();

        }


        //socket.close();

    }
}

class ClientThread extends Thread {
    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+":"+msg);
            }
        } catch (IOException e) {
            System.out.println("结束了");
        }
    }
}