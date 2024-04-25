import java.util.*;
public class LinkedlistQueue {
    public static void main(String[]args){
        Queue<Integer>queue=new LinkedList<>();
        //to insert element || similar is .add() -in this case if adding not successful then exception is thrown
        queue.offer(12);
        queue.offer(22);
        queue.offer(32);
        System.out.println(queue);
        //to delete and return head element || similar is .remove() - in this case if queue is empty then exception is thrown
        System.out.println(queue.poll());
        //to find the head element || similar is .element() - throws exception if the queue is empty
        System.out.println(queue.peek());
        
    }
}
