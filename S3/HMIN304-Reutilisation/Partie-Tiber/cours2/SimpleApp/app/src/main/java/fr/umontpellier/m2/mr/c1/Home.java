package fr.umontpellier.m2.mr.c1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.*;

@WebServlet(urlPatterns="/home")
public class Home extends HttpServlet {
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if(name != null && name.length() > 0){
            request.setAttribute("user", name);
            request.getRequestDispatcher("response.jsp").forward(request, response);   
        }else{
            throw new ServletException("Manque de paramètres");
        }
        
        /*
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Hello Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("Hello " + name);
        out.println("</BODY>");
        out.println("</HTML>");
        */
    }
}