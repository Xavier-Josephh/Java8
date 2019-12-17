package java8.functioninterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunction {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Predicate<Integer> p = i-> i>90;
        
        Function<Student,String> f = s-> {return p.test(s.getMarks())?"A":"B";};
        
        System.out.println(f.apply(new Student("Shetty", 90)));
        
        getMarkss();
    }   
    
   static String getMarkss() {
        return "";
    }

}

class Student { 
    String name;
    int marks;
    
    public Student(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    
}
