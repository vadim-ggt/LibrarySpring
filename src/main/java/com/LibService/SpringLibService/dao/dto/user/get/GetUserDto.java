package com.LibService.SpringLibService.dao.dto.user.get;


import com.LibService.SpringLibService.dao.entity.Library;
import com.LibService.SpringLibService.dao.entity.Request;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetUserDto {
    private Long id;
    private String username;
    private String email;
    private String role;
    private List<Request> requests;
    private List<Library> libraries;
}
