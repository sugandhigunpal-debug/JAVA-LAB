public class p4s5 {
   public static void main(String[] args) {
    int dividend=0;
    int divisor=0;
    try{
        int result=dividend/divisor;
        System.out.println("Result:"+result);
    }
     catch(ArithmeticException e){
        System.out.println("Division by Zero is Not Allowed");
     }
   } 
}
