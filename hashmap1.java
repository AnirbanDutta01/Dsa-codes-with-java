//package framework;
import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
    //hashmap implements as a array of linkedlist
    //hashing is changing data form..abc ->2586 or 1234-abcd
    public static void main(String[]args){
        HashMap<String,Integer>map=new HashMap<>();
        //insertion
        map.put("india",120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);//unordered map
        map.put("china",180);
        System.out.println(map);
        //search
        if(map.containsKey("china"))//boolean
        System.out.println("key presesent in map");
        else
        System.out.println("key not presesent in map");

        System.out.println(map.get("china")); //get value of key
        System.out.println(map.get("indonesia"));
        System.out.println();
        int arr[]={12,13,14};
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int val:arr){
            System.out.print(val+"val ");
        }
        System.out.println();
        for(Map.Entry<String, Integer> e:map.entrySet()){   ///for hashmap entry set loop
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //remove
        map.remove("china");
        System.out.println(map);
    }
}
