package learn001.test001;

public class Goods {

    private String cid;
    private String uname;
    private String upwd;
    private double money;
    private double ed;

    public Goods() {
    }

    public Goods(String cid, String uname, String upwd, double money, double ed) {
        this.cid = cid;
        this.uname = uname;
        this.upwd = upwd;
        this.money = money;
        this.ed = ed;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getEd() {
        return ed;
    }

    public void setEd(double ed) {
        this.ed = ed;
    }
}
