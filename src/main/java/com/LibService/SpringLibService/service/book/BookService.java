package com.LibService.SpringLibService.service.book;

import com.LibService.SpringLibService.dao.dto.book.create.CreateBookDto;
import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;
import com.LibService.SpringLibService.dao.dto.book.update.UpdateBookDto;

import java.util.List;

public interface BookService {

   GetBookDto createBook(CreateBookDto dto);
   List<GetBookDto> getAllBooks();
   GetBookDto getBook(Long id);
   void deleteBook(Long id);
   GetBookDto updateBook(Long id, UpdateBookDto dto);
}
