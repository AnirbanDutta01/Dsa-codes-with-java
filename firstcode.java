import java.util.ArrayList; //using arraylist
public class firstcode{
    static class Stack{
        static ArrayList<Integer>List=new ArrayList<>();
        public static boolean isempty(){
            return List.size()==0;
        }
        public static void push(int data){  //push
            List.add(data);
        }
        public static int pop(){    //pop
            if(isempty()){
                return -1;
            }
            int top=List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        } 
        public static int peek(){     //peek
            if(isempty()){
                return -1;
            }
            return List.get(List.size()-1); 
        }
    }
    public static void main(String[]args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
           System.out.println(s.peek());
           s.pop(); 
        }
    }
}