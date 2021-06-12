package com.shenshu.Service.Impl;

import com.shenshu.Dao.UserMapper;
import com.shenshu.MybatisUtil.MybatisUtil;
import com.shenshu.Service.UserService;
import com.shenshu.bean.User;
import org.apache.ibatis.session.SqlSession;

public class UserServiceImpl implements UserService {

    @Override
    public boolean loginUser(String name, String password) {
        SqlSession session = MybatisUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.login(name, password);
        if(user == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean registerUser(User user) {
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        boolean add = mapper.add(user);
        session.commit();
        if(add == false) {
            return false;
        }
        return true;
    }


}
