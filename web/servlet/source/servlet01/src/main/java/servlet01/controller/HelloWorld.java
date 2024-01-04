package servlet01.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{

	// 초기화(생략가능)
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Page init");
	}
	
	// get : a, location.href, method=get
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get Type 실행");
	}
	
	// post : input, method=post
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post Type 실행");
	}
	
	// 종료(생략가능)
	
	@Override
	public void destroy() {
		System.out.println("Servlet Page destroy");
	}
}
