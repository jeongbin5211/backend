package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOEx03 {

	public static void main(String[] args) throws IOException {
		
		String folder = "ioDir";
		File dir = new File("c:\\temp\\" + folder); // 만들 준비 끝
		// mkdir()
		
		String folder2 = new SimpleDateFormat("yy.MM.dd").format(System.currentTimeMillis());
		File dir2 = new File("c:\\temp\\" + folder2);
		
		if (!dir2.exists()) {
			dir2.mkdir();
			System.out.println(folder2 + "가 생성되었습니다.");
			
			// 폴더 생성하면서 busan.txt도 같이 저장
			
			File file = new File(dir2 + "\\busan.txt");
			
			// Spring 에서는 파일 이름을 현재 날짜의 1/1000초로 변경해야 합니다.
			
			// SimpleDataFormat()
			
			
			
			// 현재 시간을 1/1000
			
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
			
		}else {
			System.out.println("디렉토리가 존재합니다.");
		}

	}

}
