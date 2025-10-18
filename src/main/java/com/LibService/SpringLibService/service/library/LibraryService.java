package com.LibService.SpringLibService.service.library;

import com.LibService.SpringLibService.dao.dto.library.create.CreateLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.GetLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.update.UpdateLibraryDto;

import java.util.List;

public interface LibraryService {

    GetLibraryDto createLibrary(CreateLibraryDto dto);
    List<GetLibraryDto> getAllLibraries();
    GetLibraryDto getLibrary(Long id);
    GetLibraryDto updateLibrary(Long id, UpdateLibraryDto dto);
    void deleteLibrary(Long id);
}
