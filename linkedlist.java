import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linkedlist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> l =new LinkedList<Integer>();
        System.out.print("enter the size: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        /* for(int x : l)
            System.out.println(x);*/
       Iterator itr = l.descendingIterator();
       while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
