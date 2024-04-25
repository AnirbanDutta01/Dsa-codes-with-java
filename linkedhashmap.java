package framework;
import java.util.*;

public class linkedhashmap {//linked hashmap mainain insertion order normal hashmap doesnot
    public static void main(String[]args){
        LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
        hm.put("India", 100);//linked hashmap uses doubly linked list
        hm.put("china", 150);
        hm.put("us", 50);
        System.out.println(hm);
    }
}
