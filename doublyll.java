package linkedlistcodes;

public class doublyll {
    public class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    //add
    public void addFirst(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //print
    public void print(){
        node temp=head;
        if(head==null){
            System.out.print("ll is emoty..");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove first
    public static int removefirst(){
        if(head==null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void reversedll(){
        node curr=head;
        node prev=null;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next; //prev have to point next due to reverse
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[]args){
        doublyll ll=new doublyll();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);
        ll.reversedll();
        ll.print();
    }
}
