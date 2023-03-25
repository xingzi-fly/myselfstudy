package learn001.test010sj;

public class Factory {
    public static void main(String[] args) {
        Comtuper c1 = FactoryPattern.createCom("huawei");
        c1.start();

        Comtuper c2 = FactoryPattern.createCom("mac");
        c2.start();
    }
}
