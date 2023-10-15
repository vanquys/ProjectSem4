package com.aptech.ProjectSem4.config;


import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (request.getSession().getAttribute("userName") == null) {
            response.sendRedirect("/account/login"); 
            return false;
        }
        return true; // Cho phép tiếp tục request
    }
}