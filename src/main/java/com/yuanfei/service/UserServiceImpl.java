package com.yuanfei.service;

import com.yuanfei.Service.UserService;
import com.yuanfei.model.Users;
import com.yuanfei.Service.UserService;
import com.yuanfei.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users selectByUsernameAndPassword(String s, String s1) {
        return userMapper.selectByUsernameAndAndPassword(s,s1);
    }

    @Override
    public List<Users> selectAll() {
        return userMapper.selectAll();
    }
}
