package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {
	
	public static void main(String[] args) {
		// String -> 출력 -> 삭제 -> 출력
//		 						hasNext() -> next()
		Set<String> set = new HashSet<String>();
		
		set.add("USA");
		
		System.out.println("for2");
		
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println("while");
		
		set.clear(); // 모두 삭제
		
		// iterator.hasNext() : iterator안에 다음값이 들었는지 확인
		// 들었으면 true, 아니면 false

		// iterator.next() : iterator의 다음값 가져오기

		// iterator.remove() : next() 시에 가져왔던 값을 컬렉션(List, Set, Map) 등에서 삭제
		// 반드시 next() 후에 사용해야함

		Iterator<String> ir = set.iterator(); // 배열값을 객체에 저장
		while(ir.hasNext()) { // ir 안에 다음값이 들었는지 확인
			System.out.println(ir.next());
		}
	}
	
	
	
}
