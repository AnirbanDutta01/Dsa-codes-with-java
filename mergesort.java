package linkedlistcodes;

public class mergesort {
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
        node fast=head.next;
        while(fast!=null/*even*/ && fast.next!=null/*odd*/){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//for mid
    }
    public node merge(node head1,node head2){
        node mergedLL=new node(-1);
        node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public node mergeSort(node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        node mid=findmid(head);
        //left & right ms
        node righthead=mid.next;
        mid.next=null;
        node newleft=mergeSort(head);    //lefthalf
        node newright=mergeSort(righthead); //righthalf
        //merge
        return merge(newleft,newright);
    }
    public static void main(String[]args){
        mergesort ll=new mergesort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
    }
}
