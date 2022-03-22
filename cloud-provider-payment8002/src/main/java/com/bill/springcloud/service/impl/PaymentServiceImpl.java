package com.bill.springcloud.service.impl;

import com.bill.springcloud.dao.PaymentDao;
import com.bill.springcloud.entities.Payment;
import com.bill.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @title: PaymentServiceImpl
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/15 21:53
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
