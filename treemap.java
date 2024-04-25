

import java.util.TreeMap;

public class treemap {//keys are in sorted order
    public static void main(String[]args){//O(log n)
    //implemented using red black trees.these are self balancing trees
    TreeMap<String,Integer>hm=new TreeMap<>();
    hm.put("India",100);//also considers upper and lower case
    hm.put("China",150);
    hm.put("Us",50);
    hm.remove("Us");
    System.out.println(hm);   
    }   //same as HashMap
}
