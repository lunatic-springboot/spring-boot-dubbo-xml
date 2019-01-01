package cn.lunatic.dubbo.demo.provider.service;

import cn.lunatic.dubbo.api.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 14:05
 */

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    public String hello(String word) {
        return "Hello " + word + "!";
    }
}
