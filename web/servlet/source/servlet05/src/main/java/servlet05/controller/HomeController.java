package servlet05.controller;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

//http://localhost:8888/servlet05
@WebServlet("/")
public class HomeController extends HttpServlet {
	
	protected void doGet(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandler(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	/*
	 * url : http://localhost ~ uri : 포트번호 다음부터 ~ context : 프로젝트명
	 */
	
	public void doHandler(HttpServletRequest request, HttpServletResponse response) {
		String uri = request.getRequestURI(); // 현재 내 주소 가져오기
		System.out.println("내 URI 주소 : " + uri);
		
		String context = request.getContextPath(); // 프로젝트명
		System.out.println("내 context 이름 : " + context);
		
		String action = uri.substring(context.length());
		System.out.println("현재 Action(실행) 주소 : " + action);
		
		RequestDispatcher dispatcher = null;
		
		switch(action) {
		case "/login":
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		case "/register":
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			
		default:
			dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
	}

}
