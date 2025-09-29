package com.LibService.SpringLibService.service.library.impl;

import com.LibService.SpringLibService.dao.dto.library.create.CreateLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.GetLibraryDto;
import com.LibService.SpringLibService.dao.entity.Library;
import com.LibService.SpringLibService.dao.repository.LibraryRepository;
import com.LibService.SpringLibService.mapper.LibraryMapper;
import com.LibService.SpringLibService.service.library.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;

    @Override
    public GetLibraryDto createLibrary(CreateLibraryDto dto) {
        // Преобразуем DTO в entity
        Library library = LibraryMapper.toEntity(dto);
        // Сохраняем в базу
        Library saved = libraryRepository.save(library);
        // Преобразуем обратно в DTO для ответа
        return LibraryMapper.toGetDto(saved);
    }

    @Override
    public List<GetLibraryDto> getAllLibraries() {
        return libraryRepository.findAll().stream()
                .map(LibraryMapper::toGetDto)
                .collect(Collectors.toList());
    }
}
