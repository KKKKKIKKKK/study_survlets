package com.example.study_survlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//webservlet이라는 캡 특정이름 부여 
// 브라우저에서 요청시.url을 가지고 list up한것 과 매칭. 

@WebServlet(urlPatterns = "/helloworldServlet") //// 외부에서는 url 방식 이름으로 인식. url은 같은 컴퓨터에 있는게 아님

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("HelloWorldServlet - doGet()");

        try {
            String firstName = "yoju";
            String secondName = "Lab";
            PrintWriter printWriter = response.getWriter();
            // String contents = "Hello, World!";
            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title> Hello world ! </title>\r\n" + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "    <div> first Name : "+ firstName+" </div>\r\n" + //
                    "    <div> second Name :"+ secondName+"</div>\r\n" + //
                    "    \r\n" + //
                    "</body>\r\n" + //
                    "</html>";
            printWriter.println(contents);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("HelloWorldServlet - doGet() done.");
    }
}