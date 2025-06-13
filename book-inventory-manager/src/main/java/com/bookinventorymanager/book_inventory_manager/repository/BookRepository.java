package com.bookinventorymanager.book_inventory_manager.repository;

import com.bookinventorymanager.book_inventory_manager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByAvailableTrue();
}
