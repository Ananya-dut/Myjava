class Library{
    String[]books;
    int noOfBooks;
    Library(){
        this.books=new String[100];
        this.noOfBooks=0;
    }
    void addBook(String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("available books are:");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(book+" has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
   void returnBook(String book){
//       System.out.println(book+" has been returned");
        addBook(book);
//       System.out.println(book+" has been returned");
   }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        //you have to implement a library using java class"library"
        //Methods:addbook(),issuebook(),returnbook(),showavailablebooks()
        //properties:array to store the available books
        //array to store the issued books

        Library centrallibrary=new Library();
        centrallibrary.addBook("Operating System");
        centrallibrary.addBook("Software Engineering");
        centrallibrary.addBook("Oops");
        centrallibrary.addBook("AI");
        centrallibrary.addBook("Human Resources");
        centrallibrary.addBook("Compiler Design");
        centrallibrary.addBook("Constitution of India");
        centrallibrary.addBook("DAA");
        centrallibrary.addBook("DSA");
        centrallibrary.addBook("C");
        centrallibrary.showAvailableBooks();
        centrallibrary.issueBook("C");
        centrallibrary.showAvailableBooks();
        centrallibrary.returnBook("C");
        centrallibrary.showAvailableBooks();
    }
}
