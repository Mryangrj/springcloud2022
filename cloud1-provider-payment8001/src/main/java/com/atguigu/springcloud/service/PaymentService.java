package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author runjia.yang
 * @date 2022/3/10 15:22
 */
public interface PaymentService {
    Payment getPaymentById(@Param("id") Long id);
}
