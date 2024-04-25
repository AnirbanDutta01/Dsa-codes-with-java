package linkedlistcodes;

public class searchinlinkedlist {
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
            System.out.print("empty string..");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int itrsearch(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;//check further
            i++;
        }
        return -1;
    }
    public int helper(node head,int key){   //recursive start
        if(head==null){
            return -1;
        }
        if(head.data==key){
           return 0; 
        }     
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }//recursive end
    public static void main(String []args){
        searchinlinkedlist ll=new searchinlinkedlist();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(33));
        System.out.println(ll.recsearch(1));
        System.out.println(ll.recsearch(33));
    }
}
