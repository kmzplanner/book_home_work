public class Main {
    public static void main(String[] args) {
        Author author = new Author("Olya","Kostur");

        Book book = new Book("OK",author,2023);

        author.newBook("Финиш");
        author.newBook("Финиш2");

        System.out.println(author.numberBooks);

        System.out.println(book);
        System.out.println(book.text);

        book.append("1");
        book.append("2");


        System.out.println(book.text);
    }
}
