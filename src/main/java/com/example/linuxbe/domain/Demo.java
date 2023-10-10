package com.example.linuxbe.domain;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "Demos")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String username;
    public String text;

//    public Demo(Long id, String username, String text) {
//        this.id = id;
//        this.username = username;
//        this.text = text;
//    }
//    public Demo(){
//
//    }
}
