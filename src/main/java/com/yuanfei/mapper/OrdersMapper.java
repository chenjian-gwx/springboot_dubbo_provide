package com.yuanfei.mapper;


import com.yuanfei.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersMapper extends JpaRepository<Orders,Integer> {

    @Query(value = "select * from orders where uid=?",nativeQuery = true)
    List<Orders> selectByUid(Integer uid);
}
