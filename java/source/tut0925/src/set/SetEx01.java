package set;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
//		Set -> HashSet

//		아래 둘 중 하나 사용
//		Set<> set = new HashSet<E>();	
		
//		HashSet<> set = new HashSet<>();
		
		// HashSet 정수 저장
		// HashSet 문자열 저장
		// 삭제, 출력
		
		Set<Integer> set = new HashSet<Integer>();
		
//		배열명.add(값);
		
		set.add(100);
		set.add(200);
		set.add(300);
		
		// 값을 배열 형태로 출력할 때
		
		System.out.println(set.toString());
		// .toString은 생략가능합니다.
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println("--------------------");
		
		HashSet<String> hash = new HashSet<>();
		
		hash.add("Seoul");
		hash.add("Busan");
		hash.add("Seoul");
		
		System.out.println(hash);
		System.out.println(hash.toString()); // set은 중복된 값은 처리안함
		System.out.println(hash.size());

		// hash.remove(0);
		hash.remove("Seoul");
		
		// 향상된 for출력
		for (String str : hash) {
			System.out.println(str);
		}
		
		// 검색 배열명.contains(검색어) -> 결과는 boolean
		Set<String> set2 = new HashSet<String>();
		
		set2.add("red");
		set2.add("green");
		set2.add("blue");
		
		System.out.println(set2.contains("black"));
		System.out.println(set2.contains("red"));
		
		// remove, removeAll
		set2.remove("green");
		System.out.println(set2.size());
		
		set2.removeAll(set2);
		System.out.println(set2.size());
		
	}

}
