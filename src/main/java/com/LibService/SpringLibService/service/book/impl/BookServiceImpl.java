package com.LibService.SpringLibService.service.book.impl;

import com.LibService.SpringLibService.dao.dto.book.create.CreateBookDto;
import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;
import com.LibService.SpringLibService.dao.entity.Book;
import com.LibService.SpringLibService.dao.repository.BookRepository;
import com.LibService.SpringLibService.mapper.BookMapper;
import com.LibService.SpringLibService.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public GetBookDto createBook(CreateBookDto dto) {
        Book book = BookMapper.toEntity(dto);
        return BookMapper.toGetDto(bookRepository.save(book));
    }

    @Override
    public List<GetBookDto> getAllBooks() {
        return bookRepository.findAll().stream().map(BookMapper::toGetDto).toList();
    }
}
