package learn001.test005net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class BSserver {

    private static ExecutorService pool = new ThreadPoolExecutor(300,1500,6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            while(true){
                Socket socket = ss.accept();
                pool.execute(new ServerReaderThread(socket));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<span>大家好<span>");

            ps.flush();
            ps.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}