package com.example.linuxbe.request;


import com.example.linuxbe.domain.Demo;
import lombok.Data;

@Data
public class DemoRequest {
    private String username;
    private String text;

    public Demo toEntity(){
        return Demo.builder()
                .username(username)
                .text(text)
                .build();
    }
}