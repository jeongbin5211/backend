package emp;

import java.util.Scanner;

import emp.service.EmployeeSrv;

public class EmployeeEx {

	public static void main(String[] args) {
		EmployeeSrv srv = new EmployeeSrv();
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (run) {
			srv.menu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				srv.empCreate();
				break;
				
			case 2: 
				
				srv.empAdd();
				break;
				
			case 3: 
	
				srv.empList();
				break;
	
			case 4: 
				
				System.out.println("\n프로그램 종료");
				System.exit(0);
				System.out.println("");
				break;
				
			default:
				
				System.out.println("\n메뉴를 다시 선택해주세요.\n");
				break;
			}
		}
		

	}

}
