package learn001.test002;

import java.util.*;


public class test002 {

    public static List<Card>  all= new ArrayList<>();

    static {
        String[]sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[]colors = {"♠","♦","♥","♣"};


        int index=0;
        for (String size:sizes) {
            index++;
            for (String color:colors) {
                Card c = new Card(size,color,index);
                all.add(c);
            }
        }

        Card c1= new Card("","Joker",++index);
        Card c2= new Card("","joker",++index);

        Collections.addAll(all,c1,c2);

        System.out.println(all);
    }
    public static void main(String[] args) {
        Collections.shuffle(all);
        System.out.println(all);

        ArrayList<Card> w1 = new ArrayList<>();
        ArrayList<Card> w2 = new ArrayList<>();
        ArrayList<Card> w3 = new ArrayList<>();

        for (int i = 0; i < all.size()-3; i++) {
            Card c = all.get(i);
            if(i%3==0){
                w1.add(c);
            } else if(i%3==1){
                w2.add(c);
            } else if(i%3==2){
                w3.add(c);
            }

        }

        List<Card> w4 =  all.subList(all.size()-3, all.size());

        sortCard(w1);
        sortCard(w2);
        sortCard(w3);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

    }

    private static void sortCard(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getIndex()-o2.getIndex();
            }
        });

    }
}
