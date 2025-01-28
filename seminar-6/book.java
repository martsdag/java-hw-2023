import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public double getPrice() {
        return price;
    }
}

class BookSearchSystem {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Chemistry", "John Vain", 30.0),
                new Book("PE", "Ami Loss", 25.0),
                new Book("English", "Bob Pate", 40.0),
                new Book("Math", "Emma Toll", 35.0),
                new Book("Economics", "Ron White", 50.0)
        );

        String desiredAuthor = "Ron White";

        List<Book> filteredBooks = filterBooksByAuthor(books, book -> book.getAuthor().equals(desiredAuthor));

        System.out.println("Книги автора " + desiredAuthor + ":");
        filteredBooks.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
    }


    private static List<Book> filterBooksByAuthor(List<Book> books, FilterCondition<Book> filterCondition) {
        return books.stream()
                .filter(filterCondition::test)
                .collect(Collectors.toList());
    }


    @FunctionalInterface
    interface FilterCondition<T> {
        boolean test(T element);
    }
}