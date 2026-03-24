class vehicle{
    String ownername;
    int vehicleNo;
  
    vehicle(){
        ownername="o";
        vehicleNo=23;
    }

}
class car extends vehicle{
    int model;
    String fueltype;
    car(){
        model=689;
       fueltype="petrol";


    }
    void show(){
        System.out.println("ownername"+ownername);
        System.out.println("vehicleNo:"+vehicleNo);
        System.out.println("model:"+model);
        System.out.println("fueltype:"+fueltype);
    }

}
public class p3{
    public static void main(String []args){
    car c1= new car();
    c1.show();
  
  }}


