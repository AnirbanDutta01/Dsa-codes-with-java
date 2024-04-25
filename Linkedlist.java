package linkedlistcodes;

public class Linkedlist {
    public static class node{
        int data;
        node next;  //object of this class ..reference variable for another object
        public node(int data){  //constructor
            this.data=data;
            this.next=null;
        }
    }
    public static node head;//node type head &tail..defining as a property
    public static node tail;
    public static int size;//java will initialise its default value 0
    public void addFirst(int data){
        //step1=create new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode; 
            return; 
        }
        //step2=new node next->head
        newnode.next=head;//link//reference
        //step3--head=newnode
        head=newnode;

    }
    public void addLast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if(head==null){
            System.out.print("linked list is emoty...");
            return;
        }
        node temp=head; 
        while(temp!=null){  //we cant chng head or tail
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){//middle
        if(idx==0){ //if want to add at first then call addFirst
            addFirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //if idx=idx-1;temp=prev
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void main(String[]args){
        Linkedlist ll=new Linkedlist(); 
        //ll.head=new node(1);    //creating node with data 1
        //ll.head.next=new node(2); 
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);
    }
}
