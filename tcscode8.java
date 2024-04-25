import java.util.*;
public class tcscode8 {
    public static void main(String[]args){
        int n=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no:");
        int z=sc.nextInt();
        while(z>0){
            int temp=z%10;
            n=n*temp;
            z=z/10;
        }
        System.out.println(n);
    }
}
