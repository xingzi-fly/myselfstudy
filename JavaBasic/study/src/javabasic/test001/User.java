package learn001.test001;

public class User {


    public static String toString(int[]arr ){
        if(arr==null) {
            return null;
        }

        StringBuffer res = new StringBuffer();
        res.append("[");

        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i]+",");

        }

        res.append("]");
        return res.toString().trim();
    }

}
