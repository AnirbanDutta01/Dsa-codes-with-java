import java.util.*;
public class tcscode10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer>hs=new HashMap<>();
        hs.put('A',10);
        hs.put('B',11);
        hs.put('C',12);
        hs.put('D',13);
        hs.put('E',14);
        hs.put('F',15);
        hs.put('G',16);
        System.out.println("enter string:");
        String s=sc.nextLine();
        int j=s.length()-1;
        int num=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                num=num+hs.get(s.charAt(i))*(int)Math.pow(17, j);
                j--;
            }
            else{
                num=num+(s.charAt(i)-'0')*(int)Math.pow(17, j);
                j--;
            }
        }
        System.out.println(num);
    }
}
