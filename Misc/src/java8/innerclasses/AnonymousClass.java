package java8.innerclasses;

public class AnonymousClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//                System.out.println("hi");
//            }
//        };
        
        Runnable r =()-> System.out.println("hi");
        
        Thread t = new Thread(r);
        t.start();
    }
}
