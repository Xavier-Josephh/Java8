package java8.predicates;

public class MiscTest {
    final static String DECIMAL_REGEX = "[+-]?\\d*[.]?\\d*";
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     //   System.out.println(Double.valueOf("55"));
       
        
        System.out.println(Integer.valueOf("5.5"));
    }
    
    
    public static boolean convertToDouble(String value) {
        return value.matches(DECIMAL_REGEX);
    }
}
 