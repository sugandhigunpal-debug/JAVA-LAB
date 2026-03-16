 class Bookdetail {
    String title;
    int price;


    Bookdetail(){ }
    Bookdetail(String t ,int p){
        title=t;
        price=p;
    }


void display(){
    System.out.println("the title of the Bookdetail is :" +title);
    System.out.println("the price of the Bookdetail is :"+price);
}
}
public class book{
    public static void main(String[] args) {
        Bookdetail b1= new Bookdetail("murakami", 120);
        b1.display();
    }
}