import java.util.*;
public class tcscode9 {
    public static void main(String[]args){
        int n,j=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[0]<arr[i]){
                j++;
            }
        }
        System.out.println(j);
    }
}
