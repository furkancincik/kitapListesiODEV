import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 200, "Author1", "01/01/2022"));
        books.add(new Book("Book2", 150, "Author2", "02/02/2022"));
        books.add(new Book("Book3", 120, "Author3", "03/03/2022"));
        books.add(new Book("Book4", 80, "Author4", "04/04/2022"));
        books.add(new Book("Book5", 250, "Author5", "05/05/2022"));
        books.add(new Book("Book6", 180, "Author6", "06/06/2022"));
        books.add(new Book("Book7", 300, "Author7", "07/07/2022"));
        books.add(new Book("Book8", 90, "Author8", "08/08/2022"));
        books.add(new Book("Book9", 210, "Author9", "09/09/2022"));
        books.add(new Book("Book10", 170, "Author10", "10/10/2022"));


        Map<String, String> titleAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("Kitap ismi ile yazar ismi:");
        titleAuthorMap.forEach((title, author) -> System.out.println(title + " - " + author));

        System.out.println("\nSayfa sayısı 100'den fazla olan kitaplar:");
        filteredBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}