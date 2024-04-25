import java.util.*;
public class tcscode7 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter integer");
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int k=0,rem=0;
        int j=1;
        while(n>0){
            rem=n%2;
            sb.append(rem);
            n=n/2;
        }
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println("reversed"+sb.toString());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                sb.replace(i, j, "1");
                j++;
            }
            else{
                sb.replace(i, j, "0");
                j++;
            }
        }
        System.out.println(sb.toString());
        int e=sb.length();
        for(int i=0;i<sb.length();i++){
            k=k+(sb.charAt(i) - '0')*(int) Math.pow(2,e);
            e--;
        }
        System.out.println(k);
    }
}
