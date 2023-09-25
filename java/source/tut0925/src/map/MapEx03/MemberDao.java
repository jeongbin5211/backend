package map.MapEx03;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	
	Map<String, Member> map = null;
	
	public MemberDao() {
		map = new HashMap<String, Member>();
	}

	public void putMember(String key, Member m) {
		map.put(key, m);
	}
	
	public boolean deleteMember(String key) {
		// Map은 loop사용 x -> 순서가 없기때문
		// true, false
		
		if(map.containsKey(key)) {
			map.remove(key);
			return true;
		}
		
		return false;
	}
	
	public void showInfo() {
//		배열명.forEach((k, v) -> {
//		출력코드 = 배열명.get(키값)
//		});
		map.forEach((k, v) -> {
			map.get(k);
			Member mem = map.get(k);
			mem.disp();
			
		});
	}
}
