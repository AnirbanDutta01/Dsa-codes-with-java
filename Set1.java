import java.util.*;
public class Set1 {
    public static void main(String[]args){
        Set<Integer>set=new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        //unique elements are added in random order..It happens because of hashing
        //we can add same (key,value) pair by crreating new set
        System.out.println(set);
        set.remove(54);
        System.out.println(set);
        //to check if particular element is present
        System.out.println(set.contains(21));
        //to check if set is empty
        System.out.println(set.isEmpty());
        //to find the numberof elements
        System.out.println(set.size());
        //to clear the set
        set.clear();
        System.out.println(set);

        //created own stundent set
        //we can add same (key,value) pair by crreating new set..because by using "new" we are creating new object
        Set<Student>studentSet=new HashSet<>();
        studentSet.add(new Student("anuj", 2));
        studentSet.add(new Student("ramesh", 3));
        studentSet.add(new Student("shiv", 4));
        studentSet.add(new Student("anuj", 2));
        Student s1=new Student("Anuj",2);
        Student s2=new Student("Rohit",2);
        System.out.println(studentSet);
        System.out.println(s1.equals(s2));  //method overridden on student.java file
        System.out.println(studentSet);
    }
}
