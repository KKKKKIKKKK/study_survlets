package com.example.study_survlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloworldServlet") // 외부에서는 url 방식 이름으로 인식. url은 같은 컴퓨터에 있는게 아님 
public class HelloWorldServlet extends HttpServlet{
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("HelloWorldServlet - doGet()");
    }
}
