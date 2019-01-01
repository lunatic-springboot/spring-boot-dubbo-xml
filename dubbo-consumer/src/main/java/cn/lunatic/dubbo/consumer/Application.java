package cn.lunatic.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 14:08
 */
@SpringBootApplication
@ImportResource(locations = {"classpath*:config/spring-**.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
