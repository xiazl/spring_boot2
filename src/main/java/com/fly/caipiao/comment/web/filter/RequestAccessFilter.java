package com.fly.caipiao.comment.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author baidu
 * @date 2018/5/24 下午3:24
 * @description ${TODO}
 **/
public class RequestAccessFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        // 后台允许js跨域访问
        HttpServletResponse resp = (HttpServletResponse) response;
        resp.setHeader("Access-Control-Allow-Origin", "*");
//        resp.setHeader("Access-Control-Allow-Credentials", "true");
        resp.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,HEAD,OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, X-Requested-With");
        resp.setHeader("Cache-Control","no-cache");
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
