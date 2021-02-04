package com.janwarlen.dubbo.demo.consumer.service.impl;

import com.janwarlen.dubbo.demo.consumer.service.DemoService;
import com.janwarlen.service.DemoDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author janwarlen
 * @since 2021/2/1 17:20
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDubboService demoService;


    @Override
    public String demo() {
        return demoService.demo();
    }
}
