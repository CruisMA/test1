package com.shenshu.Service;

import com.shenshu.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    boolean loginUser(@Param("name") String name, @Param("password") String password);

    boolean registerUser(User user);
}
