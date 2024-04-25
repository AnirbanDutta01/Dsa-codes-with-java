package framework;
import java.util.*;
public class validanagram {
    public static boolean isanagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            //Character ch=s.charAt(i);
            //or
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(s,0)+1);
        }
        for(int i=0;i<t.length();i++){
            //Character ch=t.charAt(i);
            //or
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1)
                map.remove(ch);
                else
                map.put(ch,map.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[]args){
        String s="care";
        String t="race";
        System.out.println(isanagram(s, t));
    }
}
