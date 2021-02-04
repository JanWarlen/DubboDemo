package com.janwarlen.dubbo.demo.consumer.controller;

import com.janwarlen.dubbo.demo.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author janwarlen
 * @since 2021/2/1 14:42
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("demo")
    @ResponseBody
    public String demo() {
        return demoService.demo();
    }
}
