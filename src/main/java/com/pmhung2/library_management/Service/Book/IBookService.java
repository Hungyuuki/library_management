package com.pmhung2.library_management.Service.Book;

import com.pmhung2.library_management.Model.Book;
import com.pmhung2.library_management.Service.IGeneralService;

import java.util.Optional;

public interface IBookService extends IGeneralService<Book> {
    Optional<Book> findByBook_name(String book_name);

    Boolean existByBook_name(String book_name);

    Optional<Book> findById(Long id);

    Book save (Book book);
}
