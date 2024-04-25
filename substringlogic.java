import java.util.*;
public class substringlogic {
    public static String getsubstring(String str,int si,int ei){
        String substring="";
        for(int i=si;i<ei;i++){
           substring+=str.charAt(i);    //storing in the substring logic
        }
        return substring;
    }
    public static void main(String[]args){
        String str="Helloworld";
        System.out.println(getsubstring(str,0,5));      //using the logic of the function
        System.out.println(str.substring(5,7)); //using inbuild function
    } 
}
