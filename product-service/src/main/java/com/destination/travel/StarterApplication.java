package com.destination.travel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.destination.travel.repository")
public class StarterApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(StarterApplication.class,args);
    }
}
