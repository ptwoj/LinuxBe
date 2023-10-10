package com.example.linuxbe.service;


import com.example.linuxbe.domain.Demo;
import com.example.linuxbe.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

    public void save(Demo demo) {
        demoRepository.save(demo);
    }
}
