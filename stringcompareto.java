import java.util.*;
public class stringcompareto {
     public static void main(String[]args){
        String str[]={"apple","mango","banana"};
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){   //for lexicographical comparison like dictonary
                largest=str[i];            //compareToIgnorecase consider capital character=small character
            }                              //like A=a
        }
        System.out.print(largest);
     }
}
