package java8.functioninterface;

public class AddNumbersFuncImpl {
    
    public static void main(String[] args) {
        
        AddNumbers an = (a,b)-> a+b;
        an.add(1, 3);
    }
} 