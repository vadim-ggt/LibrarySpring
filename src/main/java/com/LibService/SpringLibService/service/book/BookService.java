package com.LibService.SpringLibService.service.book;

import com.LibService.SpringLibService.dao.dto.book.create.CreateBookDto;
import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;

import java.util.List;

public interface BookService {

   GetBookDto createBook(CreateBookDto dto);
   List<GetBookDto> getAllBooks();
   GetBookDto getBook(Long id);
}
