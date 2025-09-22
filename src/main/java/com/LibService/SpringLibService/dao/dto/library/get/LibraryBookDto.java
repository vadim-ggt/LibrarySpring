package com.LibService.SpringLibService.dao.dto.library.get;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibraryBookDto {
    private Long id;
    private String title;
    private String author;
    private int year;
}
