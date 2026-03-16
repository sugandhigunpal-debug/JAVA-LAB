class Rectangle{
    int length;
    int width;


Rectangle(int l,int w) {
    length=l;
    width=w;
}
  void area(){
     int area =length*width;
     System.out.println("area of the rectangle :"+area);

  }}
  public class RectangleArea {
    
  public static void main(String args[]){
    Rectangle r1 = new Rectangle(5, 10);
    r1.area();
  }
}
