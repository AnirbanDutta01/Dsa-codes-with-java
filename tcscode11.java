import java.util.*;
public class tcscode11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the direction:");
        String s=sc.nextLine();
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                x=x+10;
            }
            else if(s.charAt(i)=='U'){
                y=y+20;
            }
            else if(s.charAt(i)=='L'){
                x=x-30;
            }
            else if(s.charAt(i)=='D'){
                y=y-40;
            }
        }
        System.out.println("x:"+x+"y:"+y);
    }
}
