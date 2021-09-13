package com.otechsolution;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuandongfei
 */
@MapperScan("com.otechsolution.forex.mapper")
@SpringBootApplication
public class ForexApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForexApplication.class, args);
    }
}
