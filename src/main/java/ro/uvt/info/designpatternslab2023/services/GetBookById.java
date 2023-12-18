package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.models.Book;

public class GetBookById implements Command<Book> {

    @Override
    public Book execute() {
        return new Book("Alt exemplu");
    }
}
