import java.util.*;
public class stack1{
    public static void main(String[]args){
        Stack<String>animals=new Stack<>();
        //to add element
        animals.push("lion");       
        animals.push("Tiger");       
        animals.push("Dog");       
        animals.push("horse");       
        animals.push("cat");
        System.out.println("animals are :"+animals);
        //to see the top element
        System.out.println(animals.peek());
        //to pop the first element
        System.out.println(animals.pop());    
    }
}