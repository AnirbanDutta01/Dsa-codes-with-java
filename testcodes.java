//finding words..code is correct vs code not running
package practice;
/*import java.util.Scanner;
class Findword{
    public static void main(String[]args){
    String str1="",str2="",str3="";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the sentence:");
    str1=sc.nextLine();
    str1=str1+" ";
    System.out.println("enter the word u want to find:");
    str2=sc.nextLine();
    char chr;
    int i,p,count=0;
    p=str1.length();
    for(i=0;i<p;i++){
        chr=str1.charAt(i);
        if(chr!=' '){
            str3=str3+chr;
        }
        else{
            if(str3.equals(str2))
                count++;
                str3="";
            
        }
    }
    System.out.println("count is"+ count);
    }
}*/
/*abstract class figure{
  double dim1,dim2;
  figure(double a,double b){
    dim1=a;
    dim2=b;
  }
  abstract double area();
}
class rectangle extends figure{
  rectangle(double a,double b){
    super(a,b);
  }
  double area(){
    System.out.println("inside area for rectangle::");
    return dim1*dim2;
  }
}
class Triangle extends figure{
  Triangle(double a,double b){
    super(a,b);
  }
  double area(){
    System.out.println("inside area for triangle..");
    return dim1*dim2/2;
  }
}
class abstractareas{
  public static void main(String[]args){
    rectangle r=new rectangle(9,5);
    Triangle t=new Triangle(10,8);
    figure figref=r;   ///objects passing though reference variable figref
    System.out.println("Area is"+figref.area());
    figref=t;           ///reference variable
    System.out.println("area is "+figref.area());
  }
}*/
/*class gbase{
  public  void display(String s){
    System.out.println(s);
  }
}
class sample extends gbase{
  public void display(String s){
    System.out.println(s);
  }
public static void main(String[]args){
   sample ob=new sample();
   ob.display("tryme");
  }
}*/
// JAVA implementation using Hashmap and Collection
/*class A{
  public static void main(String[]aths){
    Error error=new Error();
    Exception exception=new Exception();
    System.out.print((exception instanceof Throwable)+" ,");
    System.out.print(error instanceof Throwable);
  }
}*/
/*import java.util.*;
class HelloWorld {
    public  static int maxno (int a,int b,int c) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        String x = keyboard.nextLine();
        String y = keyboard.nextLine();
        String z = keyboard.nextLine();
        int max = Math.max(a,b,c);
        return max;
    }

    public static void main(String[] args) {
      int a=15, b=6, c=33;
        int z=maxno(a, b, c);
    }
}*/
