public class p3s5 {
    public static void main(String[] args) {
        String str="abc";
        try{
            int num=Integer.parseInt(str);
            System.out.println("Parsed Number:"+num);
        }
        catch(NumberFormatException e){
            System.out.println("Error: unable to parse the integer");
        }
    }
}
