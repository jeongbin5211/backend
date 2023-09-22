package emp.vo;

import java.time.LocalDate;

public class Employee {
	private Long id;
	private String dept;
	private String name;
	private int salary;
	private LocalDate startDate;
	private LocalDate endDate;
	
	// 생성자
	
	public Employee() {}
	
	public Employee(Long id, String dept, String name, int salary /*  , LocalDate startDate, LocalDate endDate */) {
		this.id = id;
		this.dept = dept;
		this.name = name;
		this.salary = salary;
//		this.startDate = startDate;
//		this.endDate = endDate;
	}

	// getter, setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	public String toString() {
		return "id : " + this.getId() + " dept : " + this.getDept() + " name : " + this.getName() + " salary : " + this.getSalary() + " 입사일 : " + this.getStartDate() + " 퇴사일 : " + this.getEndDate(); 
	}

	
	
	
}
