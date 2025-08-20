package com.LibService.SpringLibService.mapper;

import com.LibService.SpringLibService.dao.dto.user.create.CreateUserDto;
import com.LibService.SpringLibService.dao.dto.user.get.GetUserDto;
import com.LibService.SpringLibService.dao.dto.user.update.UpdateUserDto;
import com.LibService.SpringLibService.dao.entity.User;
import com.LibService.SpringLibService.enums.Role;

public class UserMapper {


    public static User toEntity(CreateUserDto dto) {
        return User.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .role(Role.USER)
                .build();
    }

    public static GetUserDto toGetDto(User user) {
        GetUserDto dto = new GetUserDto();
        dto.setUsername(user.getUsername());
        dto.setId(user.getId());
        dto.setRole(user.getRole().name());
        return dto;
    }

    public static void updateEntity(User user, UpdateUserDto dto) {
        if (dto.getUsername() != null) { user.setUsername(dto.getUsername()); }
        if (dto.getPassword() != null) { user.setPassword(dto.getPassword()); }
    }
}
