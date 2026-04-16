public class p1s5 {
    public static void main(String[] args) {
        try{
            int data=10/0;

        }
         catch(ArithmeticException e){
            System.out.println("cannot divide by zero !");

         }
         finally{
            System.out.println("end of try catch block ");
         }
    }
}
