package com.lhy.demo191218;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lhy.demo191218.*.mapper")
@SpringBootApplication
public class Demo191218Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo191218Application.class, args);
    }

}
