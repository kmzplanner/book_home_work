import java.time.LocalDate;

public class Author {
    String name;
    String surname;
    int numberBooks;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.numberBooks = 0;
    }

    public Book newBook(String title){
        this.numberBooks++;
       return new Book(title,this, LocalDate.now().getYear());
    }
}
