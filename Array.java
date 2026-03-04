 import java.util.*;

 public class Array {
    public static void main (String[] args){
        ArrayList <String> names = new ArrayList <> ();

        names.add("ram");
        names.add("siya");
        names.add("priya");
        names.add("eva");
        names.add("john");

        System.out.println("names in the Arraylist");
        

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
            
        }


    }
 }