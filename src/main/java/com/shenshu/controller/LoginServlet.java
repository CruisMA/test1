package com.shenshu.controller;

import com.shenshu.Service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入controller");
        String name = req.getParameter("name");
        String password = req.getParameter("pwd");

        Date date = new Date();
        String simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd").format(date);

        UserServiceImpl userService = new UserServiceImpl();
        boolean b = userService.loginUser(name, password);
        if(b == true) {
            req.setAttribute("time",simpleDateFormat);
            req.setAttribute("name",name);
            req.setAttribute("pwd",password);
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        } else {
            req.setAttribute("msg","请输入正确的用户名或密码");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
