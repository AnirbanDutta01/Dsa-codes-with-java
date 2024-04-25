import java.util.*;
class Stringbuilder {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<'z';ch++){
            sb.append(ch);          //StringBuilder works on only objects.here we use new keyword to make object
        }                           //if we want integer object then we have to call Integer class and write Integer in
        System.out.print(sb);
    }    
}
