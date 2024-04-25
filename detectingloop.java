package linkedlistcodes;

public class detectingloop {
    //floyd cycle finding algorithm
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
            System.out.println("ll is empty..");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    ///detecting cycle
    public static boolean iscycle(){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){   //linear
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)  //for loop cycle
            return true;
        }
        return false;
    }

    ///remove a cycle
    public static void removecycle(){
        //detect cycle
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle =true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        node prev=null; //last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle->lat.next=null
        prev.next=null;
    }
    public static void main(String[]args){
        detectingloop ll=new detectingloop();
        head=new node(1);
        node temp=new node(2);
        head.next=temp;
        head.next.next=new node(3);
        head.next.next.next=temp; //1->2->3->2
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());
    }
}
