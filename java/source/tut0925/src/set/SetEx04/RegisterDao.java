package set.SetEx04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RegisterDao {
	
	Set<Register> set = null;
	
	public RegisterDao() {
		set = new HashSet<Register>();
	}
	
	public void addRegister(Register r) {
		
		set.add(r);
		
	}
	
	// 1.
	
//	public boolean removeRegister(int id) {
//		// 삭제되면 true, 아니면 false
//		Iterator<Register> ir = set.iterator();
//		while(ir.hasNext()) {
//			int tmp = ir.next().getId();
//			if (tmp == id) {
//				ir.remove();
//				return true;
//			}
//		}
//		
//		return false;
//		
//	}
	
	// 2. List index 번호로 구분 : get(i)
	// Set 값(객체)로 구분 
	// Map key 구분
	
//	public boolean removeRegister(int num) {
//		// for2
//		for (Register r : set) {
//			if (num == r.getId()) {
//				set.remove(r);
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	// 3.
	public boolean removeRegister(int num) {
		
		Iterator<Register> ir = set.iterator();
		while(ir.hasNext()) {
			Register reg = ir.next();
			int tmp = reg.getId();
			
			if (num == tmp) {
				set.remove(reg);
				return true;
			}else
				return false;
		}
		
		return false;
	}
	
	public void showInfo() {
		for (Register reg : set) {
			reg.disp();
		}
	}
}
