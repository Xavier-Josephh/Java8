package java8.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Consumer<String> c = s->System.out.println(s);
//        c.accept("helloo");
        
        ConsumerTest ct = new ConsumerTest();
        ct.m1().accept("Hello from m1()");;
    }
    
    
    public Consumer<String> m1() {
        Consumer<String> c = s->System.out.println(s);
        return c;
    }
}
