package com.bill.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @title: ConfigCenterMain3344
 * @Author huangxiaotao
 * @Date:2022 03 2022/3/30 20:45
 * @Version 1.0
 */
@SpringBootApplication
//config
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
