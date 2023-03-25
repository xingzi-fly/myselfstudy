package learn001.test010sj;

public class FactoryPattern {


    public static Comtuper createCom(String info){
        switch (info){
            case "huawei":
                Comtuper c = new Huawei();
                c.setName("huawei pro ");
                c.setPrice(5999);
                    return c;
            case "mac":
                Comtuper c2 = new Mac();
                c2.setName("MacBook pro");
                c2.setPrice(9999);
                return c2;
            default:
                return null;
        }
    }

}
