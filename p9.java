class Book{
    String Title;
    String Author;

    Book(){
        Title="Rdbms";
        Author="mr.brisley";
    }
}
class IssuedBook extends Book{
    int IssueDate;
    int returnDate;

    IssuedBook(){
        IssueDate=23;
        returnDate=30;
    }
    void show(){
        System.out.println("Title:"+Title);
        System.out.println("Author:"+Author);
        System.out.println("IssueDate:"+IssueDate);
        System.out.println("returnDate:"+returnDate);

    }
}
public class p9{
public static void main(String[] args){
    
    IssuedBook i1= new IssuedBook();
    i1.show();
  
  }}