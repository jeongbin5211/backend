package tut0922;

import java.util.ArrayList;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {
		// 정수 타입 입력 후 -> 삭제 -> 출력(for1)
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		list.remove(1); // index 1번 삭제 100, 300 만 남음
		
//		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		
		// 문자열 입력, 삭제, 출력
		List<String> alist = new ArrayList<>();
		
		alist.add("#ff 00 00"); // 색상코드 red
		alist.add("#f00"); // red
		
		alist.add("#00 ff 00"); // green
		alist.add("#0f0"); // green
		
		alist.add("0 0 255"); // blue #00f 에서 f는 255
		
		alist.remove(2);
		alist.remove("#f00");
		
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}

	}

}
