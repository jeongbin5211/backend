package io;

import java.io.File;

public class IOEx02 {

	public static void main(String[] args) {
		// 파일이 존재하는지 확인 후
		// 파일을 생성하였습니다. or 존재합니다. => exists() - boolean
		// io -> open -> close
		
		try {
			// String fileName = "C:\\temp\\koreait.txt";
			
			
			String fileName = "C:temp\\koreait.txt";
			
			// 운영체제에 맞춰서 알아서 .separator
//			File file = new File("C:" + File.separator + "temp" + File.separator +"koreait.txt");
			File file = new File(fileName); // 만들 준비 완료
			
			if (!file.exists()) {
				// 만약 파일이 존재하지 않는다면
				boolean result = file.createNewFile();
				if (result) {
					System.out.println("파일이 생성되었습니다.");
				}
			}else {
				System.out.println("파일이 이미 존재합니다.");
			}
			
			System.out.println(file.getAbsolutePath()); // 절대경로 출력
			
			// 작업(이클립스) 위치 출력
			System.out.println(System.getProperty("user.dir"));
			
		}catch (Exception e) { // 최상위 예외 Exception
			e.printStackTrace(); // 예외 발생 시 빨간글씨로 예외 띄우기
			System.out.println("파일 생성에 오류가 있습니다.");
		}finally {
//			객체명.close();
		}

	}

}
