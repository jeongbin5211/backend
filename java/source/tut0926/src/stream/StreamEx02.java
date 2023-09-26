package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx02 {

	public static void main(String[] args) throws IOException {

		String filename = "c:\\temp\\koreait.txt";
		File f = new File(filename); // 준비
		
		// FileOut ~ : 기본 false, x(덮어쓰기), true(이어적기)
		OutputStream os = new FileOutputStream(f, true);
		
		// byte(1), char(1)
		String str = "korea";
		// 1byte 로 변환하기 -> 배열명.getBytes();
		// 개행
		
		byte[] b = str.getBytes();
		os.write(b);
		os.write('\n');
		os.flush();
		os.close();
		// 두번 이상 실행하면 이어적기함
		
		
		
		

	}

}
