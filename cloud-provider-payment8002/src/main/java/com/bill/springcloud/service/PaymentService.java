package com.bill.springcloud.service;

import com.bill.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @title: PaymentService
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/15 21:53
 * @Version 1.0
 */
 public interface PaymentService {

  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}
