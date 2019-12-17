package java8.predicates;

public class LamdaRunnable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Runnable r = ()-> {
            for(int j=0;j<=10;j++) {
            System.out.println("Inside thread"+j);
            }};
        
        new Thread(r).start();
        
       for(int j=0;j<=10;j++) {
           System.out.println("Inside main thread "+j);
       }
    }
}