import java.util.*;
public class tcscode3 {
    public static void main(String[]args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[i]+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
