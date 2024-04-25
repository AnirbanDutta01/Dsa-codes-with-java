package recursion;

public class sumoffirstnaturalno {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sm1=sum(n-1);
        int sfinal=n+sm1;
        return sfinal;
    }
    public static void main (String[]args){
        int n=5;
        System.out.println(sum(n));
    }
}
