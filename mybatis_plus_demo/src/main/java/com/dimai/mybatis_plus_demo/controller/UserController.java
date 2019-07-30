package com.dimai.mybatis_plus_demo.controller;


import com.dimai.mybatis_plus_demo.entity.RefundBean;
import com.dimai.mybatis_plus_demo.service.RefundService;
import com.dimai.mybatis_plus_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author z.o.s
 * @since 2019-06-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RefundService refundService;

    @RequestMapping("/get")
    public List<RefundBean> get(){
        return refundService.getRefundBean();
    }

}

