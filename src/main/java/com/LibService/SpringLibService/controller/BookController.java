package com.LibService.SpringLibService.controller;

import com.LibService.SpringLibService.dao.dto.book.create.CreateBookDto;
import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;
import com.LibService.SpringLibService.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    public ResponseEntity<GetBookDto> createBook(@RequestBody CreateBookDto dto) {
        return ResponseEntity.ok(bookService.createBook(dto));
    }

    public ResponseEntity <List<GetBookDto>> getAllBooks() { return ResponseEntity.ok(bookService.getAllBooks());}



}
