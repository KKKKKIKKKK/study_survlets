package com.example.study_survlets.controlls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/GetRequestParamsServlet")
public class GetRequestParamsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String firstName = request.getParameter("first name ");
            String secondName = request.getParameter("second_name ");
            PrintWriter printWriter = response.getWriter();
            String contents = "<!DOCTYPE html>\r\n" +
                    "<html lang=\"en\">\r\n" +
                    "<head>\r\n" +
                    "    <meta charset=\"UTF-8\">\r\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" +
                    "    <title>Hello world!</title>\r\n" +
                    "</head>\r\n" +
                    "\r\n" +
                    "<body>\r\n" +
                    "    <div>First Name: " + firstName + "</div>\r\n" +
                    "    <div>Second Name: " + secondName + "</div>\r\n" +
                    "    \r\n" +
                    "</body>\r\n" +
                    "</html>";
            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}