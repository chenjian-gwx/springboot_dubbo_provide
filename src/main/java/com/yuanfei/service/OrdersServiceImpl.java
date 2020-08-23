package com.yuanfei.service;

import com.yuanfei.Service.OrdersService;

import com.yuanfei.model.Orders;
import com.yuanfei.mapper.OrdersMapper;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional(readOnly = true)
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> selectByUId(Integer uid) {
        return ordersMapper.selectByUid(uid);
    }
}
