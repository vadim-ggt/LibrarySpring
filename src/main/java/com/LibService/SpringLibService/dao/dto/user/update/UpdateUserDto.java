package com.LibService.SpringLibService.dao.dto.user.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserDto {
    private String username;
    private String password;
    private String email;
}
