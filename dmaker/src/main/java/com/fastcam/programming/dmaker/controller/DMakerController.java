package com.fastcam.programming.dmaker.controller;

import com.fastcam.programming.dmaker.dto.CreateDeveloper;
import com.fastcam.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {
    private final DMakerService dMakerService;  //서비스를 autowired,인젝션 해준것.

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
        System.out.println("Hello World~!");
        log.info("GET /developers HTTP/1.1 good");

        return Arrays.asList("snow", "elsa", "Olaf");
    }

    @PostMapping("/create-developer")
    public List<String> createDevelopers(
            @Valid @RequestBody CreateDeveloper.Request request
            ) {
        log.info("request:",request);

        dMakerService.createDeveloper(request);

        return List.of("HiHiOlaf");
    }
}


//   DMakerController(Bean)   DMakerService(Bean)  DeveloperRepository(Bean)
//============================Spring Application===============================