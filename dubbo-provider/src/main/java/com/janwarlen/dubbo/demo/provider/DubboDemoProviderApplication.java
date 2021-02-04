package com.janwarlen.dubbo.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author janwarlen
 * @since 2021/2/1 14:30
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class DubboDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboDemoProviderApplication.class, args);
    }
}
