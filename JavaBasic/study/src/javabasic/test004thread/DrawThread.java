package learn001.test004thread;

public class DrawThread extends Thread{
    private Account acc;

    public DrawThread (Account acc,String name){
        super(name);
        this.acc=acc;
    }


    public void setAcc(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
