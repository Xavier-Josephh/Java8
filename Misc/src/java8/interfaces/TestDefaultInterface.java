package java8.interfaces;

class TestDefaultInterface implements DefaultInterface,DefaultInterfaces2{
    
    public static void main(String[] xav) {
        TestDefaultInterface tdi =  new TestDefaultInterface();
        tdi.m1();
        
    }

    @Override
    public void m1() {
        // TODO Auto-generated method stub
        DefaultInterface.super.m1();
        DefaultInterfaces2.super.m1();
    }
}