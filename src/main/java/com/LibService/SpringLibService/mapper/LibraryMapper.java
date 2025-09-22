package com.LibService.SpringLibService.mapper;
import com.LibService.SpringLibService.dao.dto.library.create.CreateLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.GetLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.LibraryBookDto;
import com.LibService.SpringLibService.dao.dto.library.get.LibraryUserDto;
import com.LibService.SpringLibService.dao.entity.Book;
import com.LibService.SpringLibService.dao.entity.Library;
import com.LibService.SpringLibService.dao.entity.User;

import java.util.stream.Collectors;


public class LibraryMapper {

    public static Library toEntity(CreateLibraryDto dto) {
        return Library.builder()
                .name(dto.getName())
                .address(dto.getAddress())
                .build();
    }

    public static GetLibraryDto toGetDto(Library library) {
        GetLibraryDto dto = new GetLibraryDto();
        dto.setId(library.getId());
        dto.setName(library.getName());
        dto.setAddress(library.getAddress());

        // мапим книги
        if (library.getBooks() != null) {
            dto.setBooks(
                    library.getBooks().stream()
                            .map(LibraryMapper::toLibraryBookDto)
                            .collect(Collectors.toList())
            );
        }

        // мапим пользователей
        if (library.getUsers() != null) {
            dto.setUsers(
                    library.getUsers().stream()
                            .map(LibraryMapper::toLibraryUserDto)
                            .collect(Collectors.toList())
            );
        }

        return dto;
    }


    // приватный метод для Book → LibraryBookDto
    private static LibraryBookDto toLibraryBookDto(Book book) {
        LibraryBookDto dto = new LibraryBookDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setYear(book.getYear());
        return dto;
    }

    // приватный метод для User → LibraryUserDto
    private static LibraryUserDto toLibraryUserDto(User user) {
        LibraryUserDto dto = new LibraryUserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        return dto;
    }

}
