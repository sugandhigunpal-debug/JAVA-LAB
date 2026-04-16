
public class  p6s5{
    static void Checkage (int age ){
        if(age<18) {
            throw new ArithmeticException("Not Eligible ");
        }
    }
    public static void main(String[] args) {
        Checkage(15);
    }
}