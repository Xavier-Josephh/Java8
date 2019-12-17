package java8.lamda.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee e1 = new Employee(4,"Suresh","Bangalore");
        Employee e2 = new Employee(3,"Preetham","Mysore");
        Employee e3 = new Employee(2,"Abhishek","Mangalore");
        
        Employee[] ea = {e1, e2, e3};
        
        List<Employee> employeeList = Arrays.asList(ea);
        
        Comparator<Employee> ce = (o1,o2)->o1.name.compareTo(o2.name);
        
        Collections.sort(employeeList,ce);
        
        System.out.println(employeeList);

    }
}   
