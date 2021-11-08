package com.example.mydemo.mapper;

import com.example.mydemo.pojo.MyUsers;
import com.example.mydemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface UserMapper {
    //然后做一些数据库的对应操作，这次是查询操作
    @Select("select * from usertable where account=#{account}")
    User gettest(@Param("account")String account);

    //List<MyUsers> findUByUsernameAndPassword(String username,String password);


}


