package recursion;
class power{
    public static int getpower(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=getpower(x,n-1);
        int xn=x*xnm1;
        return xn;//return x*getpower(x,n-1)
    }
    ///optimized version O(logn)
    public static int optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpower(x, n/2);
        //for even
        int halfpowersq=halfpower*halfpower;
        //for odd
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[]args){
        int x=2;
        int n=3;
        System.out.println(getpower(x, n));
        System.out.println(optimizedpower(3, 3));
    }
}