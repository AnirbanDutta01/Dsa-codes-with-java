package practice;
import java.util.*;
class Array{
    static void Bubblesort(int array[]){
        int size=array.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }   
    }
    public static void main(String[]args){
        //int[]data={1,2,3,6,5,4};
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array::");
        n=sc.nextInt();
        int[]data=new int[n];
        System.out.println("enter the elements of the array::");
        for(int i=0;i<n;i++){
			data[i]=sc.nextInt();
		}  
        Array.Bubblesort(data);
        System.out.println(Arrays.toString(data));
    }
}