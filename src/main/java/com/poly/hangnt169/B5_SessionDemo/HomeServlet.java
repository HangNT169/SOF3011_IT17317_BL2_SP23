package com.poly.hangnt169.B5_SessionDemo;
/**
 * @author hangnt169
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // C2: Goi sesssion trong servlet
        HttpSession session = request.getSession();
        String tenServlet = (String) session.getAttribute("name1");
        request.setAttribute("ten1Servlet",tenServlet);
        request.getRequestDispatcher("/trang-chu.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
