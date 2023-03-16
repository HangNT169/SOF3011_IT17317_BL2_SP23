package com.poly.hangnt169.B5_SessionDemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author hangnt169
 */

@WebServlet(name = "DangNhapServlet", value = "/login")
public class DangNhapServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/dang-nhap.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("psw");
        // Check trong
        if (username.isEmpty() || password.isEmpty()) {
            request.setAttribute("mess", "Tài khoản hoặc mât khẩu đang trống");
            request.getRequestDispatcher("/dang-nhap.jsp").forward(request, response);
        }

        // Check validate
        if (username.equalsIgnoreCase("hangnt169") && password.equals("123456")) {
            // Cach tao ra 1 session tu request
            HttpSession session = request.getSession();
            // Tao ra 1 bien session
            session.setAttribute("name1",username);
            // Chuyen sang trang Home
//            request.getRequestDispatcher("/trang-chu.jsp").forward(request, response);
            response.sendRedirect("/home");
        } else {
            request.setAttribute("mess", "Tài khoản hoặc mât khẩu sai ");
            request.getRequestDispatcher("/dang-nhap.jsp").forward(request, response);
        }
    }
}
