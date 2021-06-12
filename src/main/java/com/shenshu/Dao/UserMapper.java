package com.shenshu.Dao;

import com.shenshu.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User login(@Param("name") String name, @Param("password") String password);

    boolean add(User user);
}
