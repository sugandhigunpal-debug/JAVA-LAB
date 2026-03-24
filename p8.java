 class Order{
    int orderId;
    int amount;
 Order(){
        orderId=1;
        amount=500;
    }
 }
 class Onlineorder extends Order{
    int deliveryCharge=80;
    int total;

    Onlineorder(){
     super();
     
    }
    void show(){
        total=amount+deliveryCharge;
        System.out.println("total:"+total);
    }
 }
public class p8{
public static void main(String[] args){
    Onlineorder o1= new Onlineorder();
    o1.show();
  
  }}