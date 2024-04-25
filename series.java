package practice;

import java.util.*;         
/*public class series {           //0,0,2,1,4,2,6,3
    public static void main(String[]args){
        int a=0,b=0,i=0;
        System.out.print(a+","+b+",");
        for(i=2;i<=20;i=i+1){
            if(i%2==0){
                a=a+2;
                System.out.print(a);
            }
            else{
                b=b+1;
                System.out.print(b);
            }
            System.out.print(",");
        }
    }
}*/
/*class sumofprimenumbers{
    public static void main(String[]args){
        int i,j,number,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the total no of prime no's::");
        number=sc.nextInt();
        for(j=1;j<=number;j++){
            int count=0;
            for(i=2;i<=j/2;i++){
                if(j%i==0){
                    count++;
                    break;
                }
            }
            if(count==0 && j!=1){
                    sum=sum+j;
                }
        }
        System.out.print(sum);
    }
} */
//display prime number between two interval
/*class displayprimenumbers{
    public static void main(String[]aStrings){
        int first,last,i,j,flag;
        Scanner sc=new Scanner(System.in);
        first=sc.nextInt();
        last=sc.nextInt();
        for(i=first;i<=last;i++){
            if(i==0 || i==1){
                continue;
            }
            flag=1;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
    }
}*/
/*class series{       //1,2,2,4
    public static void main(String[]args){
        int y,z,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number::");
        y=sc.nextInt();
        System.out.println("enter the second number::");
        z=sc.nextInt();
        System.out.print(y+","+z+",");
        for(i=0;i<=9;i++){
            int temp=y*z;
            y=z;
            z=temp;
            System.out.print(temp+",");
        }
    }
}*/
/*class series{  //1,4,9,16
    public static void main(String[]args){
        int a=0,i;
        for(i=0;i<10;i++){
            a=i*i;
            System.out.print(a+",");
        }
    }
}*/
/*class series{  //1,2,4,8
    public static void main(String[]args){
        int i;
        int z;
        for(i=0;i<15;i++){
            z=(int)Math.pow(2,i);
            System.out.print(z+",");
        }
    }
}*/
/*class series{       //7,10,8,11
    public static void main(String[]args){
        int i,a=7,b=10;
        System.out.print(a+","+b+",");
        for(i=0;i<10;i++){
            if(i%2==0){
                a=a+1;
                System.out.print(a);
            }
            else{
                b=b+1;
                System.out.print(b);
            }
            System.out.print(",");
        }
    }
}*/
/*class series{       //1,2,4,7
    public static void main(String[]args){
        int a=1,i;
        for(i=0;i<15;i++){
            a=a+i;
            System.out.print(a+",");
        }
    }
}*/
/*class series{     //1,1,5,5,9,9
    public static void main(String[]args){
        int i,a=1,b=1;
        System.out.print(a+","+b+",");
        for(i=0;i<15;i++){
            if(i%2==0){
                a=a+4;
                System.out.print(a);
            }
            else{
                b=b+4;
                System.out.print(b);
            }
            System.out.print(",");
        }
    }
}*/
/*class series{           //21,9,21,11,21,13
    public static void main(String[]args){
        int i,a=21,b=9;
        System.out.print(a+","+b+",");
        for(i=0;i<15;i++){
            if(i%2==0){
                System.out.print(a);
            }
            else{
                b=b+2;
                System.out.print(b);
            }
            System.out.print(",");
        }
    }
}*/
class series{
    public static void main(String[]args){
     int i,a=14;
     int b=28;
    // System.out.print(a+","+b+",");
     for(i=0 ;i<15;i++){
        if(i%2==0){
            a=a+(6*i);
            System.out.print(a);
        }
        else{
            b=b+(12*i);
            System.out.print(b);
        }
        System.out.print(",");
     }
    }
}