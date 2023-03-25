package learn001.test004thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String Card;
    private double money;
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String card, double money) {
        Card = card;
        this.money = money;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public  void drawMoney(double money) {
        String t = Thread.currentThread().getName();

        lock.lock();
        try {
            if (this.money >= money) {
                System.out.println(t + "取钱成功，取出" + money);
                this.money -= money;
                System.out.println(t + "取钱后剩余" + this.money);
            } else {
                System.out.println(t + "来取钱，但是余额不足");
            }
        } finally {
            lock.unlock();

        }

    }


}
