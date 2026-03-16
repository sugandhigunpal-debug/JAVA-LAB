
class message{
    String v;

    message(String t){
        v=t;
    }

    void display(){
        System.out.println(v);
        System.out.println("the length of the string is :" +v.length());
        System.out.println("the length of the uppercase is:" +v.toUpperCase());
    }
 }
 public class Stringlength {
    public static void main(String [] args) {
        message m = new message("honesty is the best policy");
        m.display();
    }
 }