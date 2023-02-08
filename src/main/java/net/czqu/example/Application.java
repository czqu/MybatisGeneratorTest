package net.czqu.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: MybatisGeneratorTest
 * @description:
 * @author: czq
 * @create: 2023-02-08 21:20
 **/
@SpringBootApplication
@MapperScan("net.czqu.example.dao.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
