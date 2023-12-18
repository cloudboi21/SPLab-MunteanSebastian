package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.models.Book;

public class PostBook implements  Command<Book>{

    private final Book newBook;
    private final BookService bookService;

    public PostBook(Book newBook, BookService bookService) {
        this.newBook = newBook;
        this.bookService = bookService;
    }
    @Override
    public Book execute() {
        return this.bookService.saveBook(this.newBook);
    }
}
