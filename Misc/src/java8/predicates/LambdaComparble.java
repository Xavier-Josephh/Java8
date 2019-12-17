package java8.predicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaComparble {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Comparator<Integer> c = (i, j) -> (i>j)?0:((i>j)?0:((j>i)?0:(j>i)?3:5));

        Collections.sort(new ArrayList<Integer>(), c);
        
        int i=0;
        int j=1;
        int k=2;
        int a=4;
        
        if (i > j) {
            System.out.println("1");
        } else if (i > k) {
            System.out.println("2");
        } else {
            System.out.println("Nothing");
        }
        
      int b =  (i>j)?0:((i>k)?0:((k>i)?0:(a>i)?3:5));
      
      System.out.println(b);
          
    } 
}
