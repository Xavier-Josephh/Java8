package java8.predicates;

import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {
         int[] x = {1,38,23,22,98,76};
         
         Predicate<Integer> p1 = i->i>10;
         Predicate<Integer> p2 = j->j%2==0;
         Predicate<Integer[]> p3 = k->k.length!=0 && "fd".equals("");
         
         System.out.println(p1.or(p2).negate().test(12));
    }
} 