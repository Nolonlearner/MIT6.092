package lec04;

public class Library {
    String address;
    Book[] books;
    static final String openingHours = "Libraries are open daily from 9am to 5pm.";// static final修饰常量
    public static void printOpeningHours(){
        System.out.println(openingHours);
    }

    public Library(){
        address = "default address";
        books = null;
    }
    public Library(String libraryAddress) {
        address = libraryAddress;
        books = null;
    }

    public void addBook(Book newbook){
        if(books == null){
            books = new Book[1];
            books[0] = newbook;
        }
        else{
            // 扩容
            Book[] newbooks = new Book[books.length + 1];
            for(int i = 0; i < books.length; i++){
                newbooks[i] = books[i];// 复制原数组元素
            }
            newbooks[books.length] = newbook;// 添加新元素
            books = newbooks;
        }
    }

    public void printAddress(){
        System.out.println(address);
    }

    public void borrowBook(String bookTitle){
        if(books == null){
            System.out.println("Sorry, there is no book in catalog.");
            return ;
        }
        for(int i = 0 ; i < books.length ; i++){
            if(books[i].getTitle().equals(bookTitle)){// 比较字符串内容是否相等
                books[i].borrowed();// 借书
                return ;
            }
        }
        System.out.println("Sorry, this book " + bookTitle + " is not in our catalog.");
    }

    public void printAvailableBooks(){
        if(books == null){
            System.out.println("No book in catalog.");
        }
        else{
            for(int i = 0; i < books.length; i++){
                if(books[i].isBorrowed() == false){
                    System.out.println(books[i].getTitle());
                }
            }
        }
    }

    public void returnBook(String bookTitle){
        for(int i = 0 ; i < books.length ; i++){
            if(books[i].getTitle().equals(bookTitle)){// 比较字符串内容是否相等
                books[i].returned();// 还书
                return ;
            }
        }
        System.out.println("The book " + bookTitle + " is not in our books.");
    }

    // Add the missing implementation to this class
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}