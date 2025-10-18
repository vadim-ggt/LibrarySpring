package com.LibService.SpringLibService.controller;

import com.LibService.SpringLibService.dao.dto.book.get.GetBookDto;
import com.LibService.SpringLibService.dao.dto.library.create.CreateLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.GetLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.update.UpdateLibraryDto;
import com.LibService.SpringLibService.service.library.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @PostMapping
    public ResponseEntity<GetLibraryDto> createLibrary(@RequestBody CreateLibraryDto dto) {
        GetLibraryDto created = libraryService.createLibrary(dto);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<List<GetLibraryDto>> getAllLibraries() {
        List<GetLibraryDto> libraries = libraryService.getAllLibraries();
        return ResponseEntity.ok(libraries);
    }


    @GetMapping("/{id}")
    public ResponseEntity<GetLibraryDto> getLibrary(@PathVariable Long id) {
        return ResponseEntity.ok(libraryService.getLibrary(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GetLibraryDto> updateLibrary(@PathVariable Long id,
                                                       @RequestBody UpdateLibraryDto dto) {
        return ResponseEntity.ok(libraryService.updateLibrary(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibrary(@PathVariable Long id) {
        libraryService.deleteLibrary(id);
        return ResponseEntity.noContent().build();
    }

}
