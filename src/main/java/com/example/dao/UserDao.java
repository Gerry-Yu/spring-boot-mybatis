package com.example.dao;

import com.example.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/28.
 */

@Mapper
public interface UserDao {
    @Results(id = "userResult", value = {
            @Result(property = "id", column = "userId", id = true),
            @Result(property = "name",column = "username")
    })

    @Select("select * from user where userId = #{id} ")
    User getUserById(int id);


    @Results(id = "userResult")
    @ResultMap("userResult")
    @Select("select * from user")
    List<User> getAllUsers();
}
