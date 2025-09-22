package com.LibService.SpringLibService.dao.dto.library.get;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetLibraryDto {
    private Long id;
    private String name;
    private String address;
    private List<LibraryBookDto> books;
    private List<LibraryUserDto> users;
}
