package com.example.JavaEE_Assignment3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionLifetimeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        session.setMaxInactiveInterval(1800);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
