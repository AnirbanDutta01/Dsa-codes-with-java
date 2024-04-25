import java.util.*;
public class tcdcode5 {
    public static void main(String[]args){
        ArrayList<String>al=new ArrayList<>();
        al.add("break");
        al.add("case");
        al.add("continue");
        al.add("default");
        al.add("defer");
        al.add("for");
        al.add("func");
        al.add("goto");
        al.add("if");
        al.add("map");
        al.add("range");
        al.add("return");
        al.add("struct");
        al.add("type");
        al.add("var");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(al.contains(str)){
            System.out.println("keyword");
        }
    }
}
