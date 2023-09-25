package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Board {
	private int id;
	private String subject;
	private String writer;
	private LocalDate regdate = LocalDate.now();
	
	public Board(int id, String subject, String writer) {
		this.id = id;
		this.subject = subject;
		this.writer = writer;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public LocalDate getRegdate() {
		return regdate;
	}
	
	public void disp() {
		System.out.println("번호 : " + id + ", 제목 : " + subject + ", 작성자 : " + writer + ", 작성일 : " + regdate );
	}
	
}

public class MapEx02 {

	public static void main(String[] args) {
//		p1 -> id, subject, writer, regdate
//		p2 -> id, subject, writer, regdate
//		p3 -> id, subject, writer, regdate
		
		Map<String, Board> map = new HashMap<>();
		
		map.put("p1", new Board(101, "게시물1", "홍길동"));
		map.put("p2", new Board(102, "공지사항 테스트입니다.", "관리자"));
		map.put("p3", new Board(103, "질문과답변 게시판입니다.", "나박이"));

		map.forEach((k, v) -> {
			Board board = map.get(k);
//			board.disp(); // 전체출력
			
			// 번호만 출력
			System.out.println(board.getId());
		});
		
		
		// Object로 사용시 get에서 형 변환 시켜줘야함
//		Map<String, Object> map2 = new HashMap<>();
//		Board board = (Board) map2.get(key);
	}

}
