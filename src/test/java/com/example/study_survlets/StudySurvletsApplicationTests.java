package com.example.study_survlets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StudySurvletsApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(StudySurvletsApplicationTests.class, args);
	}

}