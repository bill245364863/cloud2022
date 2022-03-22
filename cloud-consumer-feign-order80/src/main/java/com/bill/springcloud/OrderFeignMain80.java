package com.bill.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @title: OrderFeignMain80
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/23 21:04
 * @Version 1.0
 *
 * 在pom添加openfeign依赖，openfeign中已经有添加ribbon，
 * 需要在启动类上加@EnableFeignClients，然后进行服务消费，需要消费哪个服务的接口，就定义一个接口来进行调用，
 * 在这个接口上标注@FeignClient(value = "CLOUD-PAYMENT-SERVER")，对服务方的调用
 *
 * 这种方式更加符合我们现在编码格式
 *
 * 服务接口+@feignclient注解
 *  #####连接超时
 *可以在配置文件中加链接超时时间控制
 * 因为feign自带ribbon负载均衡，所以可以通过ribbon的连接时间进行设置
 *
 *
 *
 */
@SpringBootApplication
//使用feign
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
