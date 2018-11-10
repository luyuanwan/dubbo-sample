package com.alibaba.client;

import com.alibaba.api.HelloServer;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @Reference
    HelloServer helloServer;

    @RequestMapping("/hello")
    public String hello(){
        return helloServer.hello(" Dubbo");
    }
}
