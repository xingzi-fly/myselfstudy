package learn001.test003io;

import java.io.*;
import java.util.*;

public class test003 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("./src/learn001/test003io/txt002.txt",true));
        //PrintStream ps = new PrintStream("./src/learn001/test003io/txt002.txt");
        //PrintWriter ps = new PrintWriter("./src/learn001/test003io/txt002.txt");
        ps.print("aqqqas");
        ps.print(123);

        ps.close();


    }


}
