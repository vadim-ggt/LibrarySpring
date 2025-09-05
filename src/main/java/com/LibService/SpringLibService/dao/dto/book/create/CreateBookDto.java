package com.LibService.SpringLibService.dao.dto.book.create;


import com.LibService.SpringLibService.dao.entity.Library;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateBookDto {
    private String title;
    private String author;
    private int year;
    private Library library;

}
