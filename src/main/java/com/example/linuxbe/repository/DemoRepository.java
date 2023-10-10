package com.example.linuxbe.repository;


import com.example.linuxbe.domain.Demo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DemoRepository extends JpaRepository<Demo, Long> {
}
