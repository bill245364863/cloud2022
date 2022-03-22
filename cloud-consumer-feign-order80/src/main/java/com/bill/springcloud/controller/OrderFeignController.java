package com.bill.springcloud.controller;

import com.bill.springcloud.entities.Payment;
import com.bill.springcloud.service.PaymentService;
import com.bill.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: OrderFeignController
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/23 21:11
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
//    服务调用
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        log.info("我调用了8001/8002的订单获取服务");
        return paymentService.getPaymentById(id);
    }


    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentService.paymentFeignTimeout();
    }

}
