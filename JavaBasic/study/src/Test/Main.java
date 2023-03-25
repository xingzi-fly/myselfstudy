import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node head = new Node(-1);
        Node temp=head;
        for(int i=0;i<n;i++){
            int val = in.nextInt();
            Node node = new Node(val);
            temp.next=node;
            temp=temp.next;
        }
        temp = head.next;
        int k = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(temp.val);
            temp=temp.next;
        }


    }


}

class Node{
    int val;
    Node next;
    public Node(){

    }
    public Node(int value){
        this.val = value;
        this.next = null;
    }
}