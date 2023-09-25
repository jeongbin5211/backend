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
		
		Iterator<String> ir = set.iterator(); // 배열값을 객체에 저장
		while(ir.hasNext()) { // 저장된 객체를 출력
			System.out.println(ir.next());
		}
	}
	
	
	
}
