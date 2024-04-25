import java.util.*;
public class Map1 {
    public static void main(String[]args){
        Map<String,Integer>numbers=new HashMap<>();
        //in hashmap keys are unique
        //if same keys with different values are added then values get updated
        //put is used to add key value pair
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);
        //to check if a specific key is present
        System.out.println(numbers.containsKey("two"));
        //to check if a specific key is present
        System.out.println(numbers.containsValue(2));
        //numbers are added is specific key is not present
        numbers.putIfAbsent("two", 2);
        System.out.println(numbers);
        for(Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.println("The entries are:"+e); 
            System.out.println("The keys are:"+e.getKey());   
            System.out.println("the values are:"+e.getValue());
        }
        //to iterate over key set
        for(String key:numbers.keySet()){
            System.out.println("key:"+key);
        }
        //to iterate over value set
        for(Integer value:numbers.values()){
            System.out.println("value"+value);
        }
        //to check if the map is empty
        System.out.println(numbers.isEmpty());
        //to clear the map
        numbers.clear();
        System.out.println(numbers);
    }
}
