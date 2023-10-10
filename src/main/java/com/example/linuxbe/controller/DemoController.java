package com.example.linuxbe.controller;

import com.example.linuxbe.domain.Demo;
import com.example.linuxbe.request.DemoRequest;
import com.example.linuxbe.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
@CrossOrigin("*")
//@CrossOrigin("{http://localhost:3000, ")
public class DemoController {

    private final DemoService demoService;

    @GetMapping
    public List<Demo> findAll() {
        return demoService.findAll();
    }

    @PostMapping
    public void save(@RequestBody DemoRequest demoRequest) {
        demoService.save(demoRequest.toEntity());
    }
}