package AssignmentPurpose.Task3.LibraryManagementSystem;

public class Library {
    private Book[] arrayBooks ;

    public Library() {
        arrayBooks = new Book[5];
    }

    //Method to add Book
    public void addBook(Book book){
        for (int i = 0 ; i<arrayBooks.length;i++) {
            if (arrayBooks[i] == null) {
                arrayBooks[i] = book;
                System.out.println("Book successfully added ");
                return;
            }
        }
        System.out.println("Library is full! Cannot add more books.");
    }

    public void removeBook(int bookId){
        for (int i =0;i< arrayBooks.length;i++){
            if (arrayBooks[i] != null && arrayBooks[i].getBookId() == bookId){
                arrayBooks[i] =null;
                System.out.println("Book has been removed from library ID is:"+bookId);
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public Book searchBook(int bookId){
     for (Book book: arrayBooks){
         if (book != null && book.getBookId() == bookId){
             System.out.println("Book id: "+bookId+" found you had searched");
             return book;
         }
     }
     return null;
    }

    public void displayBooks() {
        boolean found = false;
        for (Book book : arrayBooks) {
            if (book != null) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Title  : " + book.getTitle());
                System.out.println("Author : " + book.getAuthor());
                System.out.println("------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available in the library.");
        }
    }


}
