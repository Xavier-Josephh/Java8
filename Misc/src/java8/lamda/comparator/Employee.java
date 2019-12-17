package java8.lamda.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class Employee { //implements  Comparator<Employee>{
    
    int id;
    static String name;
    String place;
    
    public Employee(int id, String name, String place) {
        
        super();
        this.id = id;
        this.name = name;
        this.place = place;
        
    }

//    @Override
//    public int compareTo(Employee o) {
//       // return this.id>o.id?1:(this.id<o.id?-1:0);
//        return this.name.compareTo(o.name);
//    }
    
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        // TODO Auto-generated method stub
//        return o1.id>o2.id?1:(o1.id<o2.id?-1:0);
//    }
    
    @Override
    public String toString() {
        return id+" "+name+" "+place;
    }
    
    public void customMethod() {
        System.out.println("Super Custom");
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee(2,"Suresh","Mangalore");
        Employee e2 = new Employee(3,"Preetham","Mysore");
        Employee e3 = new Employee(4,"Abhishek","Bangalore");
        
        Employee[] ea = {e1, e2, e3};
        List<Employee> employeeList = Arrays.asList(ea);
        Comparator<Employee> compr = (o1,o2)->o1.name.compareTo(o2.name);
        Collections.sort(employeeList,compr);
       // Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}