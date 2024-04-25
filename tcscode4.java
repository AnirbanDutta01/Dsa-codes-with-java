import java.util.*;
public class tcscode4 {
    public static void main(String[]args){
       String str="apple";
       String key="eapl";
       StringBuilder sb =new StringBuilder();
       int i,j;
       for(j=0;j<key.length();j++){
            for(i=0;i<str.length();i++){
            if(key.charAt(j)==str.charAt(i)){
                sb.append(str.charAt(i));
            }
        }
       }
       System.out.println(sb.toString());
    }
}
