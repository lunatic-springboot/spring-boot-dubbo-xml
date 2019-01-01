package cn.lunatic.dubbo.demo.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationStartRunner implements ApplicationRunner {
    public void run(ApplicationArguments args) {
        log.warn("dubbo-provider Start Success!");
    }
}
