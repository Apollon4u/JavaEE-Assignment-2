package com.example.JavaEE_Assignment3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ToUpperCaseFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if ("POST".equals(((HttpServletRequest) servletRequest).getMethod()))
            servletRequest = new ToUpperRequest((HttpServletRequest) servletRequest);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    static class ToUpperRequest extends HttpServletRequestWrapper {
        public ToUpperRequest(HttpServletRequest request) {
            super(request);
        }

        @Override
        public String getParameter(String name) {
            return super.getParameter(name).toUpperCase();
        }
    }
}
