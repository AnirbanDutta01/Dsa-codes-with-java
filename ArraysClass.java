import java.util.*;
import java.util.Arrays;
public class ArraysClass {
    public static void main(String[]args){
        //int []numbers={1,2,3,4,5,6,7,8,9,10};
        //int index=Arrays.binarySearch(numbers,4);//binary search works on sorted array
        //System.out.println("the index of element 4 in the array is:"+index);
        Integer[]numbers={10,2,20,30,40,5,2,1,3,7,4,1};
        Arrays.sort(numbers);
        for(int i:numbers){
            System.out.println(i+"");
        }
        Arrays.fill(numbers,12);
        for(int i:numbers){
            System.out.println(i+"");//to fill the array with the same element
        }
    }
}
