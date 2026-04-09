class Employee{
    protected int salary;
}
class HR{
    void modify(Employee e){
        e.salary=2000;
    }
}
class Manager extends Employee{
    void show(){
        System.out.println("salary"+salary);
    }
}
public class Main6{
    public static void main(String[] args) {
        Employee e1=new Employee();
        HR hr=new HR();
        hr.modify(e1);
        Manager m1 =new Manager();
        m1.show();
        System.out.println("updated salary:");
    }
}