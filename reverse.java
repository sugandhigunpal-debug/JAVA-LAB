 import java.util.*; 
 public class reverse { 
    public static void main(String [] args){

     ArrayList<String> names=new ArrayList<>(); 
     names.add("eva"); 
     names.add("rohit");
      names.add("rohan"); 
      names.add("rose");
      System.out.println("original order is:");
     System.out.println(names); 
     Collections.reverse(names);
    System.out.println("reverse order is:");
    System.out.println(names); } }
