package com.bill.springcloud.controller;

import com.bill.springcloud.entities.Payment;
import com.bill.springcloud.service.PaymentService;
import com.bill.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

/**
 * @title: PaymentController
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/15 22:07
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private Integer serverPort;


    /**
     *
     * @param payment
     * @return
     */
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + payment.toString());

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort: " + serverPort, payment.toString());
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            log.info("有人调用了查询订单接口{}", new Date());
            return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
        }
    }
}
