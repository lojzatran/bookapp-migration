package bookstore.impl.service;

import books.api.service.BooksService;
import bookstore.api.service.BookstoreService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BookstoreServiceImpl implements BookstoreService {

    private static double TAX = 1.21d;

    private BooksService booksService;

    public BookstoreServiceImpl(BooksService booksService) {
        this.booksService = booksService;
    }

    public double calculatePrice(int... bookIds) {
        double total = Arrays
                .stream(bookIds)
                .mapToDouble(id -> booksService.getBook(id).getPrice())
                .sum();

        return total * TAX;
    }

}
