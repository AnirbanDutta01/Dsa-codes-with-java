import java.util.*;
class Getno{
     int GETLARGEST(int[]number){
        int largest=Integer.MIN_VALUE;              //Integer.MIN_VALUE is used lowest possible numbers(java feature)
        for(int i=0;i<number.length;i++){           //numbers.length is used to reach last of the element
            if (number[i]>largest){
                largest=number[i];
            }
        }
        return largest;
    }
}
class Maxmin{
    public static void main(String[]args){
        int n;
        System.out.println("enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int number[]=new int [n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        Getno myGetno=new Getno();
        int newnumber;
        newnumber=myGetno.GETLARGEST(number);
        System.out.println("the largest no is :"+ newnumber);
    }
}


