package com.LibService.SpringLibService.dao.repository;

import com.LibService.SpringLibService.dao.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
