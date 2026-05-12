class Book {

    static int totalBooks; 

    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks=0;
    }

    {
        totalBooks++;
    }

    Book(String author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Book is successfully borrowed.");
        }
    }
    void returnBook(){
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Book is Successfully returned.");
        } else {
            System.out.println("Book is not borrowed yet.");
        }
    }

    public static void main(String[] args){
        Book History = new Book("Bipin Charndra", "Mordern Indian History", "1H");
        Book Geography = new Book("1G");
        System.out.println(Book.getTotalBooks());
        History.borrowBook();
        History.borrowBook();
        History.returnBook();
        History.borrowBook();

    }
}