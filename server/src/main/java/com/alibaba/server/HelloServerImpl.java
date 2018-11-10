package com.alibaba.server;

import com.alibaba.api.HelloServer;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * HelloServerImpl
 */
@Service(interfaceClass = HelloServer.class)
public class HelloServerImpl implements HelloServer{

    @Override
    public String hello(String who) {
        return "Hello " + who;
    }
}
