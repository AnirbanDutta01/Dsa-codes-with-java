import java.util.*;
public class ArrayDeque1 {
    public static void main(String[]args){
        ArrayDeque<Integer>adq=new ArrayDeque();
        //to add element at last..It has come from queue
        adq.offer(23);
        //to add element at first..it has come from arraydequeue
        adq.offerFirst(33);
        //to add element at last..it has come from arraydequeue
        adq.offerLast(13);
        adq.offerLast(16);
        System.out.println(adq);
        System.out.println(adq.peek());//front element
        System.out.println(adq.peekFirst());//front element
        System.out.println(adq.peekLast());//last element
        System.out.println(adq.poll());//front element removed
        System.out.println(adq);
        System.out.println(adq.pollFirst());//front element removed
        System.out.println(adq);
        System.out.println(adq.pollLast());//last element removed
        System.out.println(adq);
    }   
}
