 import java.util.*; 

  public class ascending {
     public static void main(String [] args)
    { 
    ArrayList<Integer> numbers=new ArrayList<>();
     numbers.add(6);
      numbers.add(11);
       numbers.add(15);
       numbers.add(14);
        numbers.add(7); 
       Collections.sort(numbers); 
       System.out.println(numbers); 
       Collections.reverseOrder();
       System.err.println(numbers);
    }
 }
 