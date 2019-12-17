package java8.innerclasses;

import java8.lamda.comparator.Employee;

public class InnerClassDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InnerClassDemo icd = new InnerClassDemo();
        icd.e.customMethod();
        icd.r.run();
        Runnable lr = ()->System.out.println("hi");
    }
    
    Employee e = new Employee(1, "name", "place") {
        void hello() {
            System.out.println("hello");
        }

        @Override
        public void customMethod() {
            System.out.println("Child Custom");
        }
    };
    
     Runnable r = new Runnable() {
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println("hi");
        }
    };
} 
