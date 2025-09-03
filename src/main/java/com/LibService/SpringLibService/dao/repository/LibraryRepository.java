package com.LibService.SpringLibService.dao.repository;

import com.LibService.SpringLibService.dao.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
