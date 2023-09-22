package tut0922;

import java.util.ArrayList;
import java.util.List;
import java.util.*; // util 안에 있는 모든것을 import

public class ListEx01 {

	public static void main(String[] args) {
		// List -> ArrayList, Vector
		// 입력, 수정, 삭제 -> 데이터 변동이 잦은거 처리
		// 정수를 출력하는 ArrayList
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		
		int count = list.size();
		
//		System.out.println(list.size());
		System.out.println(count);
		
		System.out.println("for 1");
		for (int i = 0; i < count; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------------------------");
		
		
		System.out.println("for 2");

		for (Integer num : list) {
			System.out.println(num);
		}
		
	}

}
