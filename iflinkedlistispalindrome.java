package linkedlistcodes;

public class iflinkedlistispalindrome {
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
    public node findmid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null/*even*/ && fast.next!=null/*odd*/){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//for mid
    }
    public boolean checkpalindrome(){
        if(head==null||head.next==null){    //if there is only one
            return true;
        }
        //find mid
        node midnode=findmid(head);
        //reverse second half
        node prev=null;
        node curr=midnode;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;    //prev is the right half head
        node left=head;
        //check left and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[]args){
        iflinkedlistispalindrome ll=new iflinkedlistispalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.print();  
        System.out.println(ll.checkpalindrome());
    }
}
