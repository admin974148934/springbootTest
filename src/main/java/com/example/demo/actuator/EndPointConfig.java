package com.example.demo.actuator;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 描述：自定义端点配置类
 * @author  Ay
 * @date    2017/12/9.
 */
@Configuration
public class EndPointConfig {

    @Bean
    public Endpoint<Map<String,Object>> AyUserEndPoint(){
        return new AyUserEndPoint();
    }
}
