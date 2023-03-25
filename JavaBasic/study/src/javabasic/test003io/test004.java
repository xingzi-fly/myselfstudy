package learn001.test003io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class test004 {
    public static void main(String[] args) throws IOException {
        //文件复制
        IOUtils.copy(new FileInputStream("./src/learn001/test003io/txt001.txt"),new FileOutputStream("./src/learn001/test003io/txt002.txt"));

        //文件复制到某个文件夹下
        FileUtils.copyFileToDirectory(new File(""),new File(""));

        //文件夹复制到某个文件夹下
        FileUtils.copyDirectoryToDirectory(new File(""),new File(""));


    }
}
