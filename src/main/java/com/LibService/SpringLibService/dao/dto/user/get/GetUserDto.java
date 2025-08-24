package com.LibService.SpringLibService.dao.dto.user.get;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserDto {
    private Long id;
    private String username;
    private String email;
    private String role;

}
