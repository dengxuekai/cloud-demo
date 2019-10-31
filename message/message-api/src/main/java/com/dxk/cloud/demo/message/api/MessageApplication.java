package com.dxk.cloud.demo.message.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 12:54
 */
@SpringBootApplication
@EnableEurekaClient
public class MessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class, args);
    }

}
