class Cars {
    String Brand;
    int price;
      
    Cars(String Brand,int price){
        this.Brand=Brand;
        this.price=price;

    }
    void display(){
        System.out.println("the name of the brand is :" +Brand);
        System.out.println("the price of the cars is : "+price);
    }
}
  public class Car {
     public static void main(String[] args) {
     Cars c1 = new Cars("Defender", 9000000);
     c1.display();
     }
  }
