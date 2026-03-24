class Student{
    String name;
    int marks;

    Student(){
        name="n";
        marks=60;
    }
}
class result extends Student{
    String grade;
    result(){
        grade="A";
    }
    void show(){
        System.out.println("name:"+name);
        System.out.println("marks:"+marks);
        System.out.println("grade:"+grade);
    }
}
public class p7{
public static void main(String[] args){
    result r1= new result();
    r1.show();;
  
  }}

