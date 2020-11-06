package home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.util.*;

@WebServlet("/home")
public class HelloWorld extends HttpServlet {
    
 public void doGet(HttpServletRequest request, 
  HttpServletResponse response) 
  throws ServletException, IOException {
  
  PrintWriter out = response.getWriter();
  out.println("<HTML>");
  out.println("<HEAD>");
  out.println("<TITLE>Hello</TITLE>");
  out.println("</HEAD>");
  out.println("<BODY>");
  out.println("Hello World");
  out.println("</BODY>");
  out.println("</HTML>");
 }
}