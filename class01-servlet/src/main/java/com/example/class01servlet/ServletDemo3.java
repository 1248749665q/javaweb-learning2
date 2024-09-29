package com.example.class01servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(value = "/demo3",name = "demo3")
public class ServletDemo3 implements Servlet {
    /**
     * Servlet 初始化
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletDemo3 初始化");


    }

    /**
     * 获取Servlet配置
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 执行Serlvet方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("servletDemo3 执行");
        System.out.println("Serlvet执行");
    }

    /**
     * 获取serlvet信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     * 执行销毁方法
     *
     */
    @Override
    public void destroy() {
        System.out.println("执行销毁方法");

    }
}