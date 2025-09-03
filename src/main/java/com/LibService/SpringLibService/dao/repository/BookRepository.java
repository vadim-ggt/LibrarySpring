package com.LibService.SpringLibService.dao.repository;

import com.LibService.SpringLibService.dao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
