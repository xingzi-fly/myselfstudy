package learn001.test010sj;

public class DecoratorPattern {
    public static void main(String[] args) {
        InputStream is =new BufferedInputStream(new FileInputStream());
        System.out.println(is.read());
        System.out.println(is.read(new byte[3]));
    }
}
