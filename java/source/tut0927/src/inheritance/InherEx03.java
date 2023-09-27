package inheritance;

class Person {
	String name;
	int age;
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	void eat() {
		System.out.println("식사를 합니다.");
	}
}

class Student extends Person {
	int studentId;
	
	void study() {
		System.out.println("공부를 합니다.");
	}
}

class Employee extends Person {
	int empId;
	
	void work() {
		System.out.println("출근합니다.");
	}
}

public class InherEx03 {

	public static void main(String[] args) {
		// interface, abstract -> 객체 생성해서 사용할 수 없음(new x)
		
		Student s = new Student();
		Employee emp = new Employee();
		
		s.studentId = 1635221;
		s.name = "허정빈";
		s.age = 20;
		
		
		
		System.out.println(s.studentId);
		System.out.println(s.name);
		System.out.println(s.age);
		s.study();
		s.eat();
		s.sleep();
		
		emp.empId = 1001;
		emp.name = "이지윤";
		emp.age = 20;
		
		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.age);
		emp.sleep();
		emp.work();
		emp.eat();
		
	}

}
