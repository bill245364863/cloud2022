package com.bill.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: OpenFeignConfig
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/23 21:53
 * @Version 1.0
 * <p>
 * <p>
 * NONE：默认的，不显示任何日志;
 * BASIC：仅记录请求方法、URL、响应状态码及执行时间;
 * HEADERS：除了BASIC中定义的信息之外，还有请求和响应的头信息;
 * FULL：除了HEADERS中定义的信息之外，还有请求和响应的正文及元数据。
 */
@Configuration
public class OpenFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


}
