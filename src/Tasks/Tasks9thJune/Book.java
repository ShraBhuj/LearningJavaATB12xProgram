package Tasks.Tasks9thJune;
// Write a Book class that takes title, author, and price via constructor. Display all values.
public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int bookPrice;

    Book(String bookTitle,String bookAuthor,int bookPrice)
    {
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookPrice=bookPrice;
    }

    public void displayBook()
    {
        System.out.println("bookTitle is: "+ bookTitle);
        System.out.println("bookAuthor is: " +bookAuthor);
        System.out.println("bookPrice is: " +bookPrice);
    }
    public static void main(String[] args) {
        Book boo1= new Book("Harry Potter", "J.K.Rowlings",500);
        boo1.displayBook();
    }
}
