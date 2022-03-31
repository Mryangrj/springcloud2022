package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author runjia.yang
 * @date 2022/3/10 15:24
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Payment getPaymentById(Long id) {
        return new Payment(id,"test");
    }
}
