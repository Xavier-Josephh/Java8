package java8.predicates;

import java.util.function.Predicate;

public class PredicateTest {
    
    String user;
    String pass;

    public static void main(String[] args) {
        

//        SqaureITFunc j  = i ->  {
//            System.out.println("Lamda");
//            return i*i;
//            };
//       j.squareIt(0); 
       
       
//       String[] stt = {"hi"};
//       Predicate<Integer> p = i->i>10;
//       Predicate<String> ps = s1 -> s1.equals("hi");
//       Predicate<Integer> psss = x->x%2==0;
//       Predicate<String> pi = y->stt[0].charAt(0)=='K';
       
        PredicateTest pt = new PredicateTest();
       Predicate<PredicateTest> p = p1-> p1.user.equals("") && p1.pass.equals("") && p1.user.equals("") 
                                           && p1.pass.equals("");
       p.test(pt);
        
        // Whatever we mention after -> sign , its the same as mentioning inside if condition
    }
}        