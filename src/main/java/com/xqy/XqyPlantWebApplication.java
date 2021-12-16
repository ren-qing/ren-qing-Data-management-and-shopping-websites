package com.xqy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xqy.dao")
public class XqyPlantWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XqyPlantWebApplication.class, args);
    }

}
