package com.LibService.SpringLibService.service.library.impl;

import com.LibService.SpringLibService.dao.dto.library.create.CreateLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.GetLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.update.UpdateLibraryDto;
import com.LibService.SpringLibService.dao.entity.Library;
import com.LibService.SpringLibService.dao.repository.LibraryRepository;
import com.LibService.SpringLibService.exception.EntityNotFoundException;
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
        Library library = LibraryMapper.toEntity(dto);
        Library saved = libraryRepository.save(library);
        return LibraryMapper.toGetDto(saved);
    }

    @Override
    public List<GetLibraryDto> getAllLibraries() {
        return libraryRepository.findAll().stream()
                .map(LibraryMapper::toGetDto)
                .collect(Collectors.toList());
    }

    @Override
    public GetLibraryDto getLibrary(Long id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Library not found: " + id));
        return LibraryMapper.toGetDto(library);
    }

    @Override
    public GetLibraryDto updateLibrary(Long id, UpdateLibraryDto dto) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Library not found: " + id));
        LibraryMapper.updateEntity(library, dto);
        Library updatedLibrary = libraryRepository.save(library);
        return LibraryMapper.toGetDto(updatedLibrary);
    }


    @Override
    public void deleteLibrary(Long id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Library not found: " + id));
        libraryRepository.delete(library);
    }

}
