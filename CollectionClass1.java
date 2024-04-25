import java.util.*;
public class CollectionClass1 {
    public static void main(String[]args){
        List<Integer>list=new ArrayList<>();
        list.add(34);
        list.add(44);
        list.add(38);
        list.add(4);
        list.add(39);
        list.add(100);
        list.add(55);
        System.out.println("min element:"+Collections.min(list));
        System.out.println("min element:"+Collections.max(list));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("reverse order:"+list);
        List<Student>s1=new ArrayList<>();// Comaparable implemented in student class cause we are using custom class
        s1.add(new Student("anuj", 2));
        s1.add(new Student("ramesh", 3));
        s1.add(new Student("shiv", 4));
        s1.add(new Student("anuj", 2));
        Student s2=new Student("Anuj",2);
        Student s3=new Student("Rohit",3);
        //System.out.println((s1.compareTo(s2)));
        System.out.println(s1);
        Collections.sort(s1);
        System.out.println(s1);
    }
}
