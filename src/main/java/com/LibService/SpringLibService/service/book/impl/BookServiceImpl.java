package com.LibService.SpringLibService.service.book.impl;

import com.LibService.SpringLibService.dao.dto.book.create.CreateBookDto;
import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;
import com.LibService.SpringLibService.dao.dto.book.update.UpdateBookDto;
import com.LibService.SpringLibService.dao.entity.Book;
import com.LibService.SpringLibService.dao.entity.Library;
import com.LibService.SpringLibService.dao.repository.BookRepository;
import com.LibService.SpringLibService.dao.repository.LibraryRepository;
import com.LibService.SpringLibService.exception.EntityNotFoundException;
import com.LibService.SpringLibService.mapper.BookMapper;
import com.LibService.SpringLibService.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final LibraryRepository libraryRepository;

    @Override
    public GetBookDto createBook(CreateBookDto dto) {
        Library library = libraryRepository.findById(dto.getLibraryId())
                .orElseThrow(() -> new EntityNotFoundException("Library"));

        Book book = Book.builder()
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .year(dto.getYear())
                .library(library)
                .build();

        Book saved = bookRepository.save(book);
        return BookMapper.toGetDto(saved); // возвращаем DTO
    }

    @Override
    public List<GetBookDto> getAllBooks() {
        return bookRepository.findAll().stream().map(BookMapper::toGetDto).toList();
    }


    @Override
    public GetBookDto getBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found: " + id));
        return BookMapper.toGetDto(book);
    }

    @Override
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found: " + id));
        bookRepository.delete(book);
    }


    @Override
    public GetBookDto updateBook(Long id, UpdateBookDto dto) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found: " + id));
        BookMapper.updateEntity(book, dto);
        Book updatedBook = bookRepository.save(book);
        return BookMapper.toGetDto(updatedBook);
    }

}
