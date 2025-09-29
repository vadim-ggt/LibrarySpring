package com.LibService.SpringLibService.service.library;

import com.LibService.SpringLibService.dao.dto.library.create.CreateLibraryDto;
import com.LibService.SpringLibService.dao.dto.library.get.GetLibraryDto;

import java.util.List;

public interface LibraryService {

    GetLibraryDto createLibrary(CreateLibraryDto dto);
    List<GetLibraryDto> getAllLibraries();
}
