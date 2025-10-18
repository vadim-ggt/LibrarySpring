package com.LibService.SpringLibService.controller;


import com.LibService.SpringLibService.dao.dto.request.create.CreateRequestDto;
import com.LibService.SpringLibService.dao.dto.request.get.GetRequestDto;
import com.LibService.SpringLibService.service.request.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request")
@RequiredArgsConstructor
public class RequestController {

    private final RequestService requestService;

//    @GetMapping
//    public ResponseEntity<GetRequestDto> createRequest(@RequestBody CreateRequestDto dto) {
//        GetRequestDto created = requestService.createRequest(dto);
//        return ResponseEntity.ok(created);
//    }

}



