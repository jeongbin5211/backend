package tut04;

import java.util.Scanner;

public class ContEx3 {

	public static void main(String[] args) {
		// grade 0 Guest, 1 Member 2, Admin 을 출력하세요
		// switch
		// 정수, 문자(char), 문자열
		
		int grade = 2;
		
//		switch (값) {
//		case 조건:
//			출력코드
//			break;
//		}
		
		switch (grade) {
		case 0:
			System.out.println("Guest 님 안녕하세요.");
			break;
		case 1:
			System.out.println("Member 님 안녕하세요.");
			break;
		case 2:
			System.out.println("Admin 님 안녕하세요.");
			break;
		default:
			System.out.println("error!");
			break;
		}
		
		System.out.println("-------------------------------");
		
//		"I" : 입력, "S" : 출력, "U" : 수정, "D" : 삭제
//		insert     select     update     delete
		
//		CRUD => Creat Read Update Delete
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(I/i), 출력(S/s), 수정(U/u), 삭제(D/d) >> ");
		String input = sc.next();
//		System.out.println(input); 출력 되는지 확인하는용도
		
		switch (input) {
		case "I":
		case "i":
			System.out.println("데이터베이스에 접속합니다.");
			System.out.println("SQL 입력 명령어 : INSERT INTO member VALUES()");
			System.out.println("회원정보 입력 완료!!");
			break;
			
		case "S":
		case "s":
			System.out.println("데이터베이스에 접속합니다.");
			System.out.println("SELECT * FROM member");
			System.out.println("회원정보 조회 완료!!");
			break;
		
		case "u":
			System.out.println("데이터베이스에 접속합니다.");
			System.out.println("UPDATE member SET");
			System.out.println("회원정보 수정 완료!!");
			break;
			
		case "d":
			System.out.println("데이터베이스에 접속합니다.");
			System.out.println("DELETE FROM member");
			System.out.println("회원정보 삭제 완료!!");
			break;
			
		default:
			System.out.println("잘못된 명령어 입니다.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); // 종료 코드
			
		
		}
		

	}

}
