package recursion;

public class tilingproblem {
    public static int tilingprob(int n){
        if(n==0 ||n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tilingprob(n-1);
        //horizontal choice
        int fnm2=tilingprob(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main(String[]args){
        System.out.println(tilingprob(4));
    }
}
