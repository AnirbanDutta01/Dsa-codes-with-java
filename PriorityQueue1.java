import java.util.*;
public class PriorityQueue1 {
    public static void main(String[]args){
        Queue<Integer>pq=new PriorityQueue<>();
        //internally heap data structure is used..smallest value has the highest priority
        //this is min heap
        //to add element
        pq.offer(42);
        pq.offer(12);
        pq.offer(22);
        pq.offer(32);
        System.out.println(pq);
        //to delete element
        System.out.println(pq.poll());
        System.out.println(pq);
        //to find the head element
        System.out.println(pq.peek());

        //this is according to max heap..arranged according to max order
        PriorityQueue<Integer>nw=new PriorityQueue<>(Comparator.reverseOrder());
        nw.offer(41);
        nw.offer(11);
        nw.offer(21);
        nw.offer(31);
        System.out.println("reverse order priority queue is:"+nw);
        System.out.println(nw.poll());
        System.out.println(nw);
        System.out.println(nw.peek());
    }
}
