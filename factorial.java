package recursion;

public class factorial {
    public static long fact(int n){
        if(n==0){
            return 1;
        }
        long fnm1=fact(n-1);
        long  fn=n*fact(n-1);
        return fn;
    }
    public static void main(String[]args){
        int n=13;
        System.out.println(fact(n)); 
    }
}

