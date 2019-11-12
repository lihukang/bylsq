package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class TestMySpringBootController {

	
	@RequestMapping("/Word")
	public String helloWord(Model model, HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		model.addAttribute("userId","CN41008");
		model.addAttribute("userNm","lihukang");
		
		return "forward:/index.jsp"; 
	}
}
