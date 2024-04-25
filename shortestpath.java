import java.util.*;
public class shortestpath {
    public static float shortest(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='E'){
                y++;
            }
            else if(ch=='W'){
                y--;
            }
            else if(ch=='N'){
                x--;
            }
            else{
                x++;
            }     
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[]args){
        String str="WNEENESENNN";
        System.out.println(shortest(str));
    }
}
