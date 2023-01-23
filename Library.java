import java.util.List;

public class Library {
    private String name;
    private String location;
    private String books;

    private List<String> listBooks;

    public void addBook(String book) {
        listBooks.add(book);
}

    public Library(String name, String location, String books) {
        this.name = name;
        this.location = location;
        this.books = books;
        if (this.books != null) {
            addBook(books);
        }
        
    }

    public void checkOutBook(String book) {
        listBooks.remove(book);
    }

    public void displayBooks(){
        for(int i = 0;i < listBooks.size(); ++i){
            System.out.println(listBooks.get(i));
        } 
    }
    
    
       

    

}