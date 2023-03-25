package learn001.test002;

public class Top {
    private String name;
    private double money;

    public Top() {
    }

    public Top(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Top{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
