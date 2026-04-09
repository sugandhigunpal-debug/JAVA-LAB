import.java.util.Scanner;

class ATM{
    double balance=5000;

     void withdraw(double amount) throws Exception{

     if (amount<0)
        throw new Exception("Negative amount are not allowed");
       
     if(amount>balance) throw Exception("insufficient balance");
    
     amount-=balance;

     System.out.println("Withdrawal Succesful");
    }
}
public class Main3{
    public static void main(String[] args) {
        ATM atm=new ATM();
        try{
            System.out.println("enter amount:");
        }

    }


}


