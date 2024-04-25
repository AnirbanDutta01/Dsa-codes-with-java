package queue;
import java.util.*;
public class queueusinglinkedlist {
    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static node head=null;
        static node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
           node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=head.data;
            //for single element
            if(tail==head){
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue...");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[]args){
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
    }
}
