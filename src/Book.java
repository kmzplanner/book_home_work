public class Book {
    String title;
    Author author;
    int year;
    int rating;
    String text;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 3;
        this.text = null;
    }

    public void up() {
        if (rating < 5) {
            rating++;
        }
    }

    public void down() {
        if (rating > 0) {
            rating--;
        }
    }

    public void append(String moreText) {
        text = text + moreText;
    }

}

