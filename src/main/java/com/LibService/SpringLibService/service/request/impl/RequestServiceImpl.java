package com.LibService.SpringLibService.service.request.impl;


import com.LibService.SpringLibService.dao.dto.request.create.CreateRequestDto;
import com.LibService.SpringLibService.dao.dto.request.get.GetRequestDto;
import com.LibService.SpringLibService.dao.entity.Request;
import com.LibService.SpringLibService.dao.repository.RequestRepository;
import com.LibService.SpringLibService.service.request.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

//    @Override
//    public GetRequestDto createRequest(CreateRequestDto dto) {
//        Request request = RequestMapping.toEntity(dto);
//    }
}
