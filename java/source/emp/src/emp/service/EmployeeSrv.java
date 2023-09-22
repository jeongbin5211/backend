package emp.service;

import java.util.Scanner;

import emp.vo.Employee;

public class EmployeeSrv {
	
	Scanner sc = new Scanner(System.in);
	Employee[] emp = null;
	
	public void menu() {
		// 1. 사원생성 | 2.사원등록 | 3.사원목록 | 4.종료
		System.out.println("********** Wlecome To Employees System **********");
		System.out.println("1. 사원생성"); // empCreate
		System.out.println("2. 사원등록"); // empAdd
		System.out.println("3. 사원목록"); // empList
		System.out.println("4. Exit");
		System.out.print("메뉴를 선택해주세요. >> ");
		
		
		
	}
	
	public void empCreate() {
		System.out.println("\n사원 생성 페이지\n");
		System.out.print("등록할 사원 수 >> ");
		int count = sc.nextInt();
		
		emp = new Employee[count];
		System.out.println(emp.length + "명의 사원을 등록할 수 있습니다.\n");
		
	}
	
	public void empAdd() {
		System.out.println("\n사원 등록 페이지\n");
		System.out.println(emp.length + "명의 사원을 등록합니다.\n");
		
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee(10001L, "인사과", "허정빈", 1000000);
			
			System.out.println("\n사원이 등록되었습니다.\n");
			
		}
	}
	
	public void empList() {
		System.out.println("\n사원 목록 페이지\n");
		System.out.println(emp.length + "명의 사원 목록을 출력합니다.\n");
		
//		for(출력타입 별명 : 배열명) {
//			출력코드(별명)
//		}
		
		for(Employee person : emp) {
			System.out.println(person);
		}
	}
}
