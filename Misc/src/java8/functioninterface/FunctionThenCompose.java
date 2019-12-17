package java8.functioninterface;

import java.util.function.Function;

public class FunctionThenCompose {

    public static void main(String[] xavis_args) {
        // TODO Auto-generated method stub
        Function<Integer, Integer> f1 = i -> {
            System.out.println("Inside F1");
            return i * i;
        };
        Function<Integer, Integer> f2 = i -> {
            System.out.println("Inside F2");
            return i * i;
        };
        
        System.out.println("And Then method");
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println("Compose method");
        System.out.println(f1.compose(f2).apply(2));
       
    }
}
