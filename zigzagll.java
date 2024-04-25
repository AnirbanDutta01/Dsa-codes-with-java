package linkedlistcodes;

public class zigzagll {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static void addFirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void print(){
        node temp=head;
        if(head==null){
            System.out.println("empty ll");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void zigzag(){
        //find mid
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node mid=slow;
        //reverse 2nd half
        node curr=mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node lefth=head;
        node righth=prev;
        node nextl,nextr;
        //alt merge- sigzag merge
        while(lefth!=null && righth!=null){
            nextl=lefth.next;
            lefth.next=righth;
            nextr=righth.next;
            righth.next=nextl;
            lefth=nextl;
            righth=nextr;
        }
    }
    public static void main(String[]args){
        zigzagll ll=new zigzagll();
       // ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println();
        ll.zigzag();
        ll.print();
    }
}
