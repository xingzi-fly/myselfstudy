package learn001.test004thread;

public class ThreadDemo {
    public static void main(String[] args) {

        Account acc= new Account("ICBC-111",100000);

        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
