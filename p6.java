class person{
    String name;
    int age;

    person(){
    name="n";
    age=15;
    }
}
class patient extends person{
    String disease;
    String DoctorAssigned;

    patient(){
        disease="rabies";
        DoctorAssigned="mr.sharma";

    }
    void show(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("disease:"+disease);
        System.out.println("DoctorAssigned:"+DoctorAssigned);
    }
}
public class p6{
public static void main(String[] args){
    patient p1=new patient();

    p1.show();
  
  }}


