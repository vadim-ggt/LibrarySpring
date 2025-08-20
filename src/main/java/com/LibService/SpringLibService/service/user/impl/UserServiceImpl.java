package com.LibService.SpringLibService.service.user.impl;

import com.LibService.SpringLibService.dao.dto.user.create.CreateUserDto;
import com.LibService.SpringLibService.dao.dto.user.get.GetUserDto;
import com.LibService.SpringLibService.dao.dto.user.update.UpdateUserDto;
import com.LibService.SpringLibService.dao.entity.User;
import com.LibService.SpringLibService.dao.repository.UserRepository;
import com.LibService.SpringLibService.exception.EntityNotFoundException;
import com.LibService.SpringLibService.mapper.UserMapper;
import com.LibService.SpringLibService.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public GetUserDto createUser(CreateUserDto dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toGetDto(userRepository.save(user));
    }

    @Override
    public GetUserDto getUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found: " + id));
        return UserMapper.toGetDto(user);
    }

    @Override
    public List<GetUserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public GetUserDto updateUser(Long id, UpdateUserDto dto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }


}
