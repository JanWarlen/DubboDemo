package com.janwarlen.dubbo.demo.provider.service.impl;

import com.janwarlen.service.DemoDubboService;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

/**
 * @author janwarlen
 * @since 2021/2/1 14:32
 */
@Path("demoService")
@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoDubboService {

    @GET
    @Path("demo")
    @Override
    public String demo() {
        return "demo:" + new Date().toString() + System.lineSeparator();
    }
}
