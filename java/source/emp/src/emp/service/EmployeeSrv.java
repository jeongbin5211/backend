package emp.service;

public class EmployeeSrv {
	
	public void menu() {
		// 1. 사원생성 | 2.사원등록 | 3.사원목록 | 4.종료
		System.out.println("********** Wlecome To Employees System **********");
		System.out.println("1. 사원생성");
		System.out.println("2. 사원등록");
		System.out.println("3. 사원목록");
		System.out.println("4. Exit");
		System.out.print("메뉴를 선택해주세요. >> ");
		
		
		
	}
	
	public void empCreate() {
		System.out.println("\n사원 생성 페이지\n");
	}
	
	public void empAdd() {
		System.out.println("\n사원 등록 페이지\n");
	}
	
	public void empList() {
		System.out.println("\n사원 목록 페이지\n");
	}
}
