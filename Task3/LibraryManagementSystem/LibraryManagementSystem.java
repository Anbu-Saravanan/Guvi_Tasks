package AssignmentPurpose.Task3.LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book(1,"How to Stay Calm","Embard",true);
        Book book1 = new Book(2,"Influence People","Anbu",true);
        Book book2 = new Book(3,"Spiritual Mindset","Jonathan",true);
        Book book3 = new Book(4,"Alchemist","Charles",true);
        Book book4 = new Book(5,"Rich Dad Poor Dad","Dal Carnegie",true);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.removeBook(1);
        library.searchBook(2);

        library.displayBooks();


    }
}
