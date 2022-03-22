package com.bill.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @title: EurekaMain7003
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/17 21:57
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class,args);
    }
}
