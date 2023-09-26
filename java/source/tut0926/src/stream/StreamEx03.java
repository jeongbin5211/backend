package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx03 {

	public static void main(String[] args) throws IOException {
		// k(1) o (1) r e a			자료가 없으면 -1 return
		String filename = "c:\\temp\\koreait.txt";
		InputStream is = new FileInputStream(filename); // 파일 내용을 읽어올 준비
		
		// is.read(); // 1 byte 씩 읽어옴 (실제 처리는 4byte사용)
//		while(true) {
////			is.read(); // 글자를 byte로 읽어오지만 정수로 처리
//			int result = is.read();
//			if (result == -1) { // 더이상 출력할 글자가 없으면 -1 return
//				break; // 제일 가까운 반복문 탈출
//			}
//			
//			
//			System.out.print((char)result);
//			System.out.println("남은 byte(s)는 " + is.available() + "입니다.");
//				
//		}
//		is.close();
		
		// 짧게 쓰기
		int result = 0;
		while((result = is.read()) != -1) {
			System.out.println(result + " > ");
			System.out.println((char)result);
		}
		is.close();
	}

}
