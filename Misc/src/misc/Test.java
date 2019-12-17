package misc;

        public class Test 
        { 
            
             String s1="yes";
            
           public enum Colorr 
            { 
                RED(new Test().s1), GREEN(""), BLUE(""); 
               public String s;

                Colorr(String s){
                    this.s=s;
                }
            } 
          
            // Driver method 
            public static void main(String[] args) 
            { 
                System.out.println(Colorr.RED.s); 
            } 
        }
