package com.pmhung2.library_management.Service.Book;

import com.pmhung2.library_management.Entity.Book;
import com.pmhung2.library_management.Reposiroty.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BookImpl implements IBookService{
    @Autowired IBookRepository bookRepository;

//    @Override
//    public Boolean existsByBook_name(String book_name){
//        return bookRepository.existsByBook_name(book_name);
//    }
//
//    @Override
//    public Optional<Book> findByBook_name(String book_name){
//        return bookRepository.findByBook_name(book_name);
//    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void removeById(Long id) {
        bookRepository.deleteById(id);
    }
}
