package com.example.study_survlets;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StudySurvletsApplicationTests {
//1-1메인이 동작하면 @servletcomonetscan 스캔도 같이함. 
//1-2 servlet도 같이 같이 스캔 how? hello폴더 webservlet보고 함. 
	public static void main(String[] args) {
		SpringApplication.run(StudySurvletsApplicationTests.class, args);
	}

}