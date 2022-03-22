package com.bill.springcloud.service;

import com.bill.springcloud.entities.Payment;
import com.bill.springcloud.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
//设置要找哪个微服务
@FeignClient(value = "CLOUD-PAYMENT-SERVER")
public interface PaymentService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
