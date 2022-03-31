package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author runjia.yang
 * @date 2022/3/10 21:57
 */
@Configuration
public class ApplicationContextConfig {
    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
