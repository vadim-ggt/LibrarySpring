package com.LibService.SpringLibService.mapper;

import com.LibService.SpringLibService.dao.dto.book.create.CreateBookDto;
import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;
import com.LibService.SpringLibService.dao.dto.book.update.UpdateBookDto;
import com.LibService.SpringLibService.dao.entity.Book;

public class BookMapper {

    public static Book toEntity(CreateBookDto dto) {
        return Book.builder().
                title(dto.getTitle()).
                author(dto.getAuthor()).
                year(dto.getYear()).
                build();
    }

    public static GetBookDto toGetDto(Book book) {
        GetBookDto dto = new GetBookDto();
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setYear(book.getYear());
        dto.setLibraryId(book.getLibrary() != null ? book.getLibrary().getId() : null);
        return dto;
    }

    public static void updateEntity(Book book, UpdateBookDto dto) {
        if (dto.getTitle() != null) book.setTitle(dto.getTitle());
        if (dto.getAuthor() != null) book.setAuthor(dto.getAuthor());
        if (dto.getYear() != null) book.setYear(dto.getYear());
    }


}
