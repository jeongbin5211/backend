package tut0919;

import java.time.LocalDate;
import java.time.LocalDateTime;

class Board {
	private int num;
	private String subject;
	private String writer;
	private LocalDateTime regist = LocalDateTime.now(); // LocalDateTime = 년 월 일 시, LocalDate = 년 월 일
	
	// 생성자
//	public Board() {}
	
	// getter setter
	// subject
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
	
	// num
//	public void setNum(int num) { //set = 저장
//		this.num = num;
//	}
//	
//	public int getNum() { // get = 출력
//		return num;
//	}
	
	
	
	// 출력 메소드
	@Override
	public String toString() {
		return "게시판 [번호 : " + num + ", 제목 : " + subject + ", 작성자 : " + writer + ", 작성일 : " + regist + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDateTime getRegist() {
		return regist;
	}

	// 날짜는 set으로 저장하지않음 -> 서버가 저장함 -> 별도의 처리가 필요 -> private LocalDateTime regist = LocalDateTime.now();
//	public void setRegist(LocalDateTime regist) {
//		this.regist = regist;
//	}
	
	
}

public class BoardEx {

	public static void main(String[] args) {
		// 번호 int, 제목 String, 작성자 String, 작성일 LocalDateTime

		Board b = new Board();
		System.out.println(b.toString());
		
		System.out.println("--------입력---------");
		b.setNum(1);
		b.setSubject("게시판 테스트1");
		b.setWriter("허정빈");
		
		System.out.println("");
		System.out.println("--------출력---------");
		// get 출력
//		System.out.println(b.getNum());
//		System.out.println(b.getSubject());
//		System.out.println(b.getWriter());
//		System.out.println(b.getRegist());
		
		// 메소드로 출력
		System.out.println("");
		b.toString();
		
		System.out.println(b.toString());
		
	}

}
