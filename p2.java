class Emplyoee{
    String name;
    int baseSalary;
    Emplyoee(){
        name="n";
        baseSalary=50;
    }
}
class Manager extends Emplyoee{
    int bonus=50;
    int totalsalary;

    Manager(){
        
       }

        void show(){
            totalsalary=baseSalary+bonus;
        System.out.println("totalsalary:"+totalsalary);
        }
        
    
}
public class p2{
public static void main(String[] args){
    Manager m1= new Manager();
    m1.show();
  
  }}



