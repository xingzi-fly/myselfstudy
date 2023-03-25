package learn001.test005net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Servertcp {

    public static List<Socket>allSocket = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+"上线了");
                allSocket.add(socket);

                new ServerThread(socket).start();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"："+msg);
                sendMsg(msg);

            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
            Servertcp.allSocket.remove(socket);
        }
    }

    private void sendMsg(String msg) throws IOException {
        for (Socket socket:Servertcp.allSocket){
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}