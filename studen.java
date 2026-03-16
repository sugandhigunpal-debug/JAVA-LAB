class student {
     String name;
     int rollNo ;
   
   student( String n, int r) {
       name= n;
       rollNo=r;
   }

  void display(){
    System.out.println(" name :"+name);
    System.out.println("rollno:"+rollNo);
    } }

    public class studen{
  public static void main(String args[]){
    student s1= new student("rohan",45);
    s1.display();
  
  }}


