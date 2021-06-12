package com.shenshu.controller;

import com.shenshu.Service.Impl.UserServiceImpl;
import com.shenshu.bean.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("register");
        String name = request.getParameter("name");
        String password = request.getParameter("pwd");
        //检查用户名密码是否存在
        UserServiceImpl service = new UserServiceImpl();
        boolean b1 = service.loginUser(name, password);
        if(b1 == true) {
            request.setAttribute("msg","用户名已存在");
            request.getRequestDispatcher("Register.jsp").forward(request,response);
        }

        //注册用户
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        boolean b = service.registerUser(user);
        if(b == true) {
            request.setAttribute("msg","注册成功，请登录");
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
