package com.dimai.mybatis_plus_demo.service.impl;

import com.dimai.mybatis_plus_demo.entity.RefundBean;
import com.dimai.mybatis_plus_demo.mapper.UserMapper;
import com.dimai.mybatis_plus_demo.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundImpl implements RefundService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<RefundBean> getRefundBean() {
        return userMapper.getFund();
    }
}
