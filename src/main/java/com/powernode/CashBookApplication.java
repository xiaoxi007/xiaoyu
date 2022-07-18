package com.powernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.powernode.mapper"})
public class CashBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashBookApplication.class, args);
    }

}
