package cn.lunatic.dubbo.consumer.controller;


import cn.lunatic.dubbo.api.service.DemoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 14:39
 */
@RestController
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("hello")
    public String hello(){
        return demoService.hello("Word");
    }

}
