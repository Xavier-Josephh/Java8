package java8.functioninterface;

import java.util.Collections;
import java.util.function.Function;

public class BuildtInFunction {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Function<String,String> f1 = i-> i+" I'm returning f1";
        Function<String,String> f2 = j-> j+" I'm returning f2";
      //  System.out.println(f1.apply(""));
        System.out.println(f1.apply("this"));
        System.out.println(f1.andThen(f2).apply("AndThen"));
        System.out.println(f1.compose(f2).apply("Compose"));
    }
} 