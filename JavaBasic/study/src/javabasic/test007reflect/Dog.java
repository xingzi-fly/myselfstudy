package learn001.test007reflect;

public class Dog {
    private String name;

    public Dog(){

    }

    public Dog(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("小狗跑得快");
    }

    private void eat(){
        System.out.println("小狗吃骨头");
    }

    private String eat(String name){
        System.out.println("狗吃"+name);
        return "吃的开心";
    }

    public static void inAdrr(){
        System.out.println("有一群小狗狗");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
