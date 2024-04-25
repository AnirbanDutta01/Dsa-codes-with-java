import java.util.*;

public class TreeSet1 {
    public static void main(String[]args){
        Set<Integer>set=new TreeSet<>();
        //elements will be added in the sorted order
        //implements using binary search tree
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(65);
        //unique elements are added in random order..It happens because of hashing
        System.out.println(set);
        set.remove(54);
        System.out.println(set);
        //to check if particular element is present
        System.out.println(set.contains(21));
        //to check if set is empty
        System.out.println(set.isEmpty());
        //to find the numberof elements
        System.out.println(set.size());
        //to clear the set
        set.clear();
        System.out.println(set);
    }
}
