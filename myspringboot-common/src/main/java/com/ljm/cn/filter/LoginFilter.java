package com.ljm.cn.filter;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author lijms
 * @date 2021/2/27/027 16:24
 */
@WebFilter
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 交由spring容器管理
        WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(filterConfig.getServletContext());
        //获取工厂的一种方法
        wac.getAutowireCapableBeanFactory().autowireBean(this);


    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
