import java.util.*;
class Binarysearchh{
    /*int Sorted(int[]num){
            int temp;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                        if(num[j]>num[j+1]){
                                temp=num[j];
                                num[j]=num[j+1];
                                num[j+1]=temp;
                        }
            }
            return num;
        }
    }
        public static*/ int Binarysearchh(int[]num,int key){
                   int start=0,end= num.length-1;
                   
                   while(start<=end){
                        int mid=(start+end)/2;
                        if(num[mid]==key){
                            return num[num[mid]];
                        }
                        if(num[mid]<key){
                            start=num[mid]+1;
                        }
                        else{
                            end=num[mid]-1;
                        }
                       
                   } return -2;
                  
                
        }

 }
 class element {
    public static void main(String[]args){
        System.out.println("enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int[]number={1,3,5,7,9,2,8};
        int num[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        } 

        System.out.println("enter the element to find:");
        int key=sc.nextInt();
        Binarysearchh mybinarysearch=new Binarysearchh();
        int newno=mybinarysearch.Binarysearchh(num, key);
        if (newno==-2){
            System.out.println("key not found.");
        }
        else{
            System.out.println("key is at index"+ newno);
        } 
    }

}