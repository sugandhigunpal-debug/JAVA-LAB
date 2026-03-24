 class Account{
    int accNo;
    int balance;

    Account(){
        accNo=896;
        balance=50000;
    }
 }
 class Savingsaccount extends Account{
    int interest;
    
     void showintrest(){
        int p= balance;
        int r=1;
        int t=1;
        interest=(p*r*t)/100;

     }

 }
 public class p5 {
public static void main(String args[]){
    Savingsaccount s1= new Savingsaccount();
    s1.showintrest();
  
  }}

