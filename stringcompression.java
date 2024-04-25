public class stringcompression {
    public static String compress(String str){
        String newStr="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++;
            }
            newStr+=str.charAt(i);
           // sb.append(i);
            if(count>1){
                //sb.toString(count);
                newStr+=count.toString();
            }
            
        }
        //System.out.println(sb);
        return newStr;
    }
    public static void main(String[]args){
        String str="aaabbbbccdd";
        System.out.print(compress(str));
    }
}
