package learn001.test003io;

import java.io.*;

public class test001 {
    public static void main(String[] args) {
        Student s = new Student("陈飞","admin","admin",15);

        File f1= new File("./src/learn001/test003io/txt003.txt");
        try (

                //ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(f1));
                ObjectInputStream iis = new ObjectInputStream(new FileInputStream(f1));

             ){

            //oos.writeObject(s);
            Student sk = null;

            sk = (Student) iis.readObject();

            System.out.println(sk.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
