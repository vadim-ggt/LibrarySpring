package com.LibService.SpringLibService.dao.dto.book.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBookDto {
    private String title;
    private String author;
    private Integer year;
}
