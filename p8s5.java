
class BankAccount{
    double balance=5000;

     void withdraw(double amount) {
       
     if(amount>balance){
        
        throw new ArithmeticException ("insufficient balance");
     }
     else{

    amount-=balance;
        System.out.println("Remaining amount"+balance);
       System.out.println("Withdrawal balance"+amount);
    }
  }
}

 
public class p8s5{
    public static void main(String[] args) {
         
        BankAccount b1= new BankAccount();
        b1.withdraw(600);

    }
}


