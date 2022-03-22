package com.bill.springcloud;

import com.bill.rule.MyRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @title: OrderMain80
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/16 21:20
 * @Version 1.0
 * 使用ribbon + resttemplate进行服务调用，
 * 可以设置调用策略
 */
@SpringBootApplication
@EnableEurekaClient
//添加到此处
@RibbonClient(name = "cloud-payment-server", configuration = MyRobinRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
