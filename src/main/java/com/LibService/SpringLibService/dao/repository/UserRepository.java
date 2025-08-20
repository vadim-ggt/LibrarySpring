package com.LibService.SpringLibService.dao.repository;

import com.LibService.SpringLibService.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
