import java.util.*;
public class tcscode6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0;
        int [] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("array is");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
