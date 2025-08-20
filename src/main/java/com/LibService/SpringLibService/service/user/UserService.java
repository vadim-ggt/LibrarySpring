package com.LibService.SpringLibService.service.user;

import com.LibService.SpringLibService.dao.dto.user.create.CreateUserDto;
import com.LibService.SpringLibService.dao.dto.user.get.GetUserDto;
import com.LibService.SpringLibService.dao.dto.user.update.UpdateUserDto;
import com.LibService.SpringLibService.dao.entity.User;

import java.util.List;

public interface UserService {

    GetUserDto createUser(CreateUserDto dto);
    GetUserDto getUser(Long id);
    List<GetUserDto> getAllUsers();
    GetUserDto updateUser(Long id, UpdateUserDto dto);
    void deleteUser(Long id);

}
