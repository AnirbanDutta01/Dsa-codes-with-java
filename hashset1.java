

import java.util.HashSet;
import java.util.Iterator;
public class hashset1{
    public static void main(String[]args){
    HashSet<Integer>set=new HashSet<>();
    //insert
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(1); //doesnot allow duplicate
    //search
    if(set.contains(1)){
        System.out.println("set contains 1");
    }
    if(!set.contains(6)){
        System.out.println("doesnot contain");
    }
    //deletion
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("doesnot contain 1");
    }
    //size
    System.out.println("size"+set.size());
    //print all elements
    System.out.println(set);
    //iterator
    Iterator it=set.iterator();
    //.next function returns next vslue
    //it.hasnext gives true or false based on the elements
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
}