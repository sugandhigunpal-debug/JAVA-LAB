class product{
    String name;
    int price;
     
    product(){
        name="n";
        price=60;

    }
}
class electronics extends product{
    String warrantyPeriod;
    electronics(){
        warrantyPeriod="fiveyears";
    }
    void show(){
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("warrantyPeriod:"+warrantyPeriod);
    }
}
public class p4{
    public static void main(String []args){
    electronics e1= new electronics();
    e1.show();
  
  }}

