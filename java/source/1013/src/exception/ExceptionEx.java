package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) {
		/* 
		  - Exception : 컴파일
		   1. classNotFoundException : Class.forName(디비 또는 서버);
		   2. IOException : 입출력
		   3. FileNotFoundException : 파일이 없는 경우
		   4. InterruptException : 쓰레드
		   5. CloneNotSupportException : clone 객체 사용시 
		*/
		
		// 1. ClassNotFoundException
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 예외가 발생한 부분 표시 : 개발자가 사용
			e.getMessage(); // 예외 메시지
			System.out.println("404 Error : 관리자에게 문의하세요.");
			
		} finally { // 성공, 실패 여부 상관없이 마지막에 한번은 무조건 실행됨
//			System.out.println("프로그램 종료.");
//			rs.close();
//			ps.close();
//			conn.close();
//			
//			if (rs != null) {
//				rs.close();
//			}
//			
//			try {
//				if (conn != null) {
//					conn.close();
//				}
//			}
			
		}

		try {
			
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			e.getMessage();
			System.out.println("404 Error : 관리자에게 문의하세요.");
			
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
			
		} finally {
			System.out.println("종료합니다.");
		}
		
	}

}
