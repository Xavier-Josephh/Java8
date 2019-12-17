package java8.predicates;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Predicate<Integer> p = i->i%2==0;
        
        String [] s = {"a","b"};
        System.out.println(s[1]);
        
        List<Integer> numbers = Arrays.asList(5,2,3,4,4);
        numbers.stream().forEach(System.out::println);
        numbers.stream().forEach(x->System.out.println(x));
        System.out.println(numbers.stream().anyMatch(p));
        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(i->i%2==0).collect(Collectors.toList()));
        System.out.println(numbers.stream().noneMatch(p));
        System.out.println(numbers.stream().allMatch(p));
        System.out.println(numbers.stream().sequential().collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
    }
}
