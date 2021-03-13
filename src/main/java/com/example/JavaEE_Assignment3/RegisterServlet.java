package com.example.JavaEE_Assignment3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> errors = new ArrayList<>();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String password_confirmation = req.getParameter("password_confirmation");
        if (name.equals("")){
            errors.add("Name is required");
        }
        if (email.equals("")){
            errors.add("Email is required");
        }
        if (password.equals("")){
            errors.add("Password is required");
        }
        if (!password.equals(password_confirmation)){
            errors.add("Passwords are not equal");
        }
        if (!errors.isEmpty()) {
            req.setAttribute("errors", errors);
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
        }
        req.setAttribute("isNew", true);
        HttpSession session = req.getSession();
        session.setAttribute("email", email);
        session.setMaxInactiveInterval(300);
        req.getRequestDispatcher("/profile.jsp").forward(req, resp);
    }
}
