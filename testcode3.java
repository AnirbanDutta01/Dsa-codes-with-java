package practice;

import java.util.Scanner;

/*class test{
    public static void main(String[]args){
        int sum=0;
        int h1=Integer.MIN_VALUE;
        int h2=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the first array::");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter the size of the second array::");
         int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the elements of the first array::");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the elements of the second array::");
         for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>h1){
                h1=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>h2){
                h2=arr2[i];
            }
        }
        sum=h1+h2;
        System.out.println(sum);
    }
}*/
/*class test{
    public static void main (String[]args){
        int i,n,z=-1,j;
        System.out.println("enter the size of the array::");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter the array elements::");
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for( j=0;j<n;j++){
                  if(arr1[j]==i){
                    arr1[j]=i;
                    //System.out.print(arr1[i]);
                }
                
            }
        }
    }
}*/
/*class test{
    public static void main (String[]args){
        int i,n,z=-1,j,c;
        System.out.println("enter the size of the array::");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter the array elements::");
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
			c=0;
            for( j=0;j<n;j++){
                  if(i==arr1[j]){

					c++;
                    arr1[i]=arr1[j];
                }
               
            }
			if(c==0)
				arr1[i]=-1;
 }
         String str=arr1.toString();
         for(i=0;i<str.length();i++){
            
         }
        System.out.print("New modified array is:: ");
        for(i=0;i<n;i++){
	    System.out.print(arr1[i]+"\t");
        }
        System.out.println();
    }
}*/
/*class test{
    public static void main(String[]args){
        int i,count=0;
        char ch;
        String str="INFoRMaTION";
        StringBuffer str1=new StringBuffer(str);
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                str1.setCharAt(i,Character.toUpperCase(ch));
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println(str1);
        System.out.println(str1.reverse());
        System.out.println(count);
    }
}*/
/*class Test{
    public static void main(String[]args){
        int i,j,k=0,n1,n2,n3;
        int  t1;
        int count=0,store=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the 1st array::");
        n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter the elemets of the 1st array::");
        for(i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("enter the size of the 2nd array::");
        n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the elemets of the 2nd array::");
        for(i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("enter the size of the 3rd array::");
        n3=sc.nextInt();
        System.out.println("enter the elemets of the 3rd array::");
        int arr3[]=new int[n3];
        for(i=0;i<n3;i++){
            arr3[i]=sc.nextInt();
        }
        
        for(i=0;i<n1;i++){
            t1=arr1[i];
            for(j=0;j<n2;j++){
                if(t1==arr2[j]){
                    for(k=0;k<n3;k++){
                    if(arr2[j]==arr3[k]){
                        store=arr3[k];
                         count++;
                    }
                }
                }
            }
            if(count!=0){
                System.out.print(store+",");
            }
            count=0;
        }
       // System.out.println(store+",");
    }
}
*/
/*class test{
    public static void main(String[]args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of thr array::");
        n=sc.nextInt();
        System.out.println("enter the elements of the array::");
        int arr1[]=new int[n];
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the sum u want to find::");
        int key=sc.nextInt();
        for(i=0;i<n;i++){
            int a=arr1[i];
            int b=arr1[i+1];
            if((a+b)==key){
                System.out.println(a+","+b);
            }
        }
    }
}*/
import java.util.*;
class test{
    public static void main(String[]args){
        char i,ch=' ';
        int count=0;
        int maxfreq=0,maxfreq2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the characters:: ");
        String str=sc.nextLine();
        for( i='a';i<='z';i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(i==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxfreq){
                maxfreq=count;
                ch=i;
            } 
        }
        for( i='a';i<='z';i++){
            //count=0;
            for(int j=0;j<str.length();j++){
                if(i==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxfreq2 && count<maxfreq){
                maxfreq2=count;
                ch=i;
            } 
        }
        System.out.println(maxfreq2+","+ch);
    }
}



