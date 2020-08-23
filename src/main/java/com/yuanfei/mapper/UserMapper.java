package com.yuanfei.mapper;

import com.yuanfei.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserMapper extends JpaRepository<Users,Integer> {


    @Query( value = "select * from users where username=? and password=?",nativeQuery = true)
    Users selectByUsernameAndAndPassword(String username,String password);

    @Query(value = "select * from users",nativeQuery = true)
    List<Users> selectAll();
}
