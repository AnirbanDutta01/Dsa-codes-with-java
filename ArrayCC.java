import java.util.*;
import java.util.Arrays;
class Array{
		
			int linearsearch(int[] numbers,int key){
				for(int i=0;i<numbers.length;i++){
					if(numbers[i]==key){
						return i;
					}
				}
				return -1;
			}
}
class New{
	public static void main(String[] args){
		
		System.out.println("enter the size of the arrray:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num[]=new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("enter the element to find:");
		int key=sc.nextInt();
		Array myarray=new Array();
		int find;
		find=myarray.linearsearch(num,key);
		if(find==-1){
			System.out.println("number not found.");
		}
		else {
			System.out.println(key+" number is at: " +find);
		}	
		int arr[]=new int[2];
		for(int i=0;i<arr.length;i++){
			arr[0]=2;
			arr[1]=3;
			//arr[2]=4;
		}	
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
} 
