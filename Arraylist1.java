import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Arraylist1 {
    public static void main(String[]args){
        List<Integer>list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //Add in a specific position
        list.add(3,4);//list.add(index,element)
        System.out.println(list);
        List<Integer>newList=new ArrayList();
        newList.add(150);
        newList.add(160);
        System.out.println(newList);
        //to merge a list with another list
        list.addAll(newList);//oldlist.add(newlist)
        System.out.println(list);
        //to get elements
        System.out.println(list.get(2));//list.get(index)
        //removing element from list
        list.remove(0);//list.remove(index)
        System.out.println(list);
        //To remove a specific type of element from the arraylist
        list.remove(Integer.valueOf(150));//list.remove(typeofelement.valueof())
        System.out.println(list);
        //to clear the list
        newList.clear();//to completely remove a list
        //to update a element
        list.set(2,100); //list.set(index,updated element)
        System.out.println(list);
        //to check if a specific element is present
        System.out.println(list.contains(100));//list.contains(element)
        //iteration
        for(int i=0;i<list.size();i++){
            //list.size gives how many elements are present in the list. 
            System.out.println("iteration using for loop:"+list.get(i));
        }
        for(Integer i:list){
            System.out.println("iteration using for each:"+i);
        }
        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){
            System.out.println("iterator:"+it.next());
        }
        Collections.sort(list); //to sort an arraylist
    }
}
