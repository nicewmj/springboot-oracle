package com.dimai.mybatis_plus_demo;

import com.dimai.mybatis_plus_demo.entity.RefundBean;
import com.dimai.mybatis_plus_demo.service.RefundService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

    @Autowired
    private RefundService refundService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getRefund () {
        List<RefundBean> refundBean = refundService.getRefundBean();

        System.out.println(refundBean);
    }

}
