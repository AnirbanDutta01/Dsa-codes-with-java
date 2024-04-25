import java.util.*;
class palindrome {
    public static boolean ispalindrome(String s1){
        for(int i=0;i<(s1.length()/2);i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
class newww{ 
        public static void main(String[]args){
        System.out.println("enter the string::");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        palindrome p=new palindrome();
        System.out.println(p.ispalindrome(s1));
    }
}
