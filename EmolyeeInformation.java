 class Employee{
    String name;
    String Desigination;
    int salary;
 
 Employee(String n,String d,int s){
    name=n;
    Desigination=d;
    salary=s;
 }
 void display(){
    System.out.println("name"+name);
    System.out.println("Desigination"+Desigination);
    System.out.println("salary"+salary);
 }}

 public class EmolyeeInformation {
   
  public static void main(String args[]){
   Employee e1 = new Employee("rahul"," manager", 7);
   e1.display();
  }
 }

