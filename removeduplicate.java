package recursion;

public class removeduplicate {
    public static void remove(String s,int idx,StringBuilder sb,boolean map[]){
        if(idx==s.length()){
            System.out.println(sb);
            return;
        }
        char currchar=s.charAt(idx);
        if(map[currchar-'a']==true){
            remove(s, idx+1, sb, map);
        }
        else{
            map[currchar-'a']=true;
            remove(s, idx+1, sb.append(currchar), map);
        }
    }
   public static void main(String[]args){
    String s="appnacollege";
    remove(s, 0, new StringBuilder(""),new boolean[26]);
   } 
}
