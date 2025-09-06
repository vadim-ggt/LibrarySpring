package com.LibService.SpringLibService.dao.dto.book.get;

import com.LibService.SpringLibService.dao.entity.Library;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetBookDto {
    private Long id;
    private String title;
    private String author;
    private int year;
    private Long libraryId; // только id, без всей сущности
}
