package com.janwarlen.dubbo.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author janwarlen
 * @since 2021/2/1 14:39
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class DubboDemoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboDemoConsumerApplication.class, args);
    }
}
