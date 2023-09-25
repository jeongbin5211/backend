package map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// Map - HashMap
		// 101 -> 서울
		// 102 -> 부산
		// 103 -> 대구
		// 104 -> 서울 // 값은 중복가능, key는 중복불가능
		
//		Map<key, value> map = new HashMap<K, V>();
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "서울");
		map.put(102, "부산");
		map.put(103, "대구");
		
//		System.out.println(map.toString());
		
//		배열명.forEach((k별명, v별명) -> {
//			출력코드
//		});
		
		map.forEach((k, v) -> {
			System.out.println("키는 " + k + ", 값은 " + v);
		});
		
		System.out.println("-----------------------");

//		map
//		userid01 -> 홍길동
//		userid02 -> 김철수
//		userid03 -> 나박이
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("userid01", "홍길동");
		map2.put("userid02", "김철수");
		map2.put("userid03", "나박이");
		map2.put("userid03", "나박이 값이 안나옴");// 같은 key값 사용금지
		
		map2.forEach((key, value) -> {
			System.out.println("id는 " + key + ", 이름은 " + value);
		});
		
		// 원하는 값이 있는지 확인하기 -> true or false
		System.out.println(map2.containsValue("김철수"));
		
		System.out.println(map2.containsKey("userid01"));
		
		
	}

}
