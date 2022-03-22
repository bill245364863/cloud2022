package com.bill.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @title: ApplicationContextConfig
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/16 21:24
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * RestTemplate提供了多种边界访问远程http服务的方法
     * 是一种简单便捷的访问restful服务模块类，是spring提供的用于访问rest服务的客户端模块工具类
     * @return
     */
    @Bean
    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
