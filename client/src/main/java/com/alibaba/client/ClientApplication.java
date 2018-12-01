package com.alibaba.client;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Client
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.alibaba.client")
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
