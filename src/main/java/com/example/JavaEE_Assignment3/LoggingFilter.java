package com.example.JavaEE_Assignment3;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;

public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Logger logger = Logger.getLogger("log");
        logger.info(servletRequest.getParameter("email"));
        logger.info(servletRequest.getParameter("password"));
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
