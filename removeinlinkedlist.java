package linkedlistcodes;

public class removeinlinkedlist {
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
    public static int size;
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
    public void print(){
        if(head==null){
            System.out.print("linked list is empty..");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            return value;
        }
        int value=head.data;
        head=head.next; //gives next node add
        size--;
        return value;
    }
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty..");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;    
        return val;
    }
    public void deleteNth(int n){
        //calculate size
        int sz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){      //for deleting head
            head=head.next; //remove first
            return;
        }
        int i=1;    //if not then this case starts
        int iTofind=sz-n;
        node prev=head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;//making connection
    }
    public static void main(String[]args){
        removeinlinkedlist ll=new removeinlinkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.print();
        ll.removefirst();
        ll.print();
        System.out.println("size"+ll.size);
        ll.removelast();
        ll.print();
        System.out.println("size"+ll.size);
        ll.addFirst(3); 
        ll.addFirst(6); 
        ll.addFirst(7);
        ll.print();
        ll.deleteNth(4);
        ll.print();
        ll.deleteNth(4);
        ll.print();
    }
}
