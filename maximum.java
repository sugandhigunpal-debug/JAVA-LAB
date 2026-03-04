import java.util.*;

 public class maximum { public static void main(String [] args)
    { 

    ArrayList<Integer> numbers=new ArrayList<>();
       numbers.add(23);
       numbers.add(11);
       numbers.add(12);
       numbers.add(14);
       numbers.add(13);
       int max=Collections.max(numbers);
       int min=Collections.min(numbers); 
       System.out.println("the maximum numebers is :");
       System.out.println(max); 
      System.out.println("the minimum number is:");
      System.err.println(min); } }
