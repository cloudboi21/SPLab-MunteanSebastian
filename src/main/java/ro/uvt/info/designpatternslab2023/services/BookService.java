package ro.uvt.info.designpatternslab2023.services;

import org.springframework.stereotype.Component;
import ro.uvt.info.designpatternslab2023.models.Book;

@Component
public class BookService {

    public Book saveBook(Book newBook) {
        System.out.println("Salvam cartea");
        return newBook;
    }
}