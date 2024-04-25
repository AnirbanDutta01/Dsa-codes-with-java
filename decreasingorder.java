package recursion;

/*public class decreasingorder {
    public static void PrintDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void main(String[]args){
       int n=10;
       PrintDec(n);
    }
}*/
class increasingorder{
    public static void increasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[]args){
        int n=10;
        increasing(n);
    }
}
