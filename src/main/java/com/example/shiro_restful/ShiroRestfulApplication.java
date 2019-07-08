package com.example.shiro_restful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//定时任务
//@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = {"com/example/shiro_restful/mapper"})
public class ShiroRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroRestfulApplication.class, args);
    }

}
