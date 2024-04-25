import java.util.*;
public class tcscode2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='E'&& s.charAt(i+1)=='F' )||(s.charAt(i)=='5' && s.charAt(i)=='6')){
                i++;
                continue;
            }
            else if(s.charAt(i)=='G'){
                i++;
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String t=sb.toString();
        System.out.println(t);
    }
}
