package recursion;

public class pairingproblem {
    public static int friend(int n){
        if(n==1||n==2)
        return n;
        /*int fnm1=friend(n-1);   //single
        int fnm2=friend(n-2);   //pair
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;*/
        //another process
        return friend(n-1) +(n-1)*friend(n-2);
    }
    public static void main(String[]args){
        System.out.println(friend(3));
    }
}
