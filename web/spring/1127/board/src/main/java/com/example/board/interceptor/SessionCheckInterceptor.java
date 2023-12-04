package com.example.board.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class SessionCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String reqURI = request.getRequestURI(); // 접속한 주소 요청
        System.out.println(reqURI);

        // request 서버가 전달
        // response 서버로 전달
        HttpSession hs = request.getSession();
        // LoginInfo -> 아이디 비번 등 정보 담는 객체
        
        if(hs == null || hs.getAttribute("LoginInfo") == null) {
            System.out.println("You are not Incorrectly");
//            response.sendRedirect("/?redirectURI=" + reqURI);
            response.sendRedirect("/login?redirectURI=" + reqURI); // 비정상적 접속은 로그인페이지로 이동시킴
            return false; // 세션이 없다면 false
        }

        return true;
    }
}
