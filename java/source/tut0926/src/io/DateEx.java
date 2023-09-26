package io;

import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		
		// currentTimeMillis()
		// 월(MM) - 분(mm)
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
		System.out.println(new SimpleDateFormat("yy.MM.dd").format(System.currentTimeMillis()));
		
		System.out.println(System.currentTimeMillis());
		
		// substring(".") - . 을 기준으로 잘라내기
//		원본저장 : koreait.txt
//		
//		사본저장 : System.currentTimeMillis().txt
//		
//		용량저장 : 1 ~ 10MB

	}

}
