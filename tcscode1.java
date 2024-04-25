import java.util.*;
public class tcscode1 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int rem=0,mul=1;
        while(n!=0){
            rem=n%10;
            mul=mul*rem;
            n=n/10;
        }
        System.out.println(mul);
    }    
}
