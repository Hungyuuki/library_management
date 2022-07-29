package com.pmhung2.library_management.Reposiroty;

import com.pmhung2.library_management.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByBook_name(String book_name);
    Boolean existsByBook_name(String book_name);
}
