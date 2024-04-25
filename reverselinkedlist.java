package linkedlistcodes;

public class reverselinkedlist {
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
        if(head==null){
            System.out.println("ll is empty..");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void revese(){    //itr approachzx
        node prev=null;
        node curr=tail=head;    //reversing so tail becomes head
        node next;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next; 
        }
        head=prev;
    }
    public static void main(String[]args){
        reverselinkedlist ll=new reverselinkedlist();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.revese();
        ll.print();
    }
}
