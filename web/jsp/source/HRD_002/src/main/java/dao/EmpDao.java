package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db.DBConnect;
import dto.Buseo;
import dto.Employee;

public class EmpDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	DBConnect db = new DBConnect();
	List<Buseo> list = new ArrayList<Buseo>();
	List<Employee> empList = new ArrayList<Employee>(); 
	
	public List<Buseo> getBuseoAll() throws SQLException {
		conn = db.getConnection();
		
		String sql = "SELECT B.buseo_name, B.buseo_code, count(emp_id) as cnt FROM \r\n"
				+ "buseo B INNER JOIN employees E ON B.buseo_code = E.buseo_code \r\n"
				+ "GROUP BY B.buseo_name, B.buseo_code ORDER BY B.buseo_code ASC";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		if( rs.next() ) {
			do {
				Buseo buseo = new Buseo();
				buseo.setBuseo_code(rs.getString("buseo_code"));
				buseo.setBuseo_name(rs.getString("buseo_name"));
				buseo.setCnt(rs.getInt("cnt"));
				
				list.add(buseo);
				
			}while(rs.next());
		}
		
		return list;
	}
	
	
	//입력
	public int insertEmployee(Employee emp) throws SQLException {
		conn = db.getConnection();

		String sql = "INSERT INTO employees VALUES(emp_seq.nextval, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, emp.getEmp_name());
		pstmt.setString(2, emp.getEmp_email());
		pstmt.setString(3, emp.getEmp_addr());
		pstmt.setString(4, emp.getBuseo_code());
		int row = pstmt.executeUpdate();
		
		return row;
	}		
	
	//수정
	public void updateEmployee(Employee emp) {
		
		
	}
	
	//삭제
	public void deleteEmployee(int emp_id) {
		
	}
	
	//1명 출력
	public Employee getEmployeeOne(int emp_id) {
			
		return null;		
	}
	
	//전체 출력
	public List<Employee> getEmployeeAll(String buseo_code) throws SQLException {
		conn = db.getConnection();
		String sql = "SELECT * FROM employees WHERE buseo_code = ? ORDER BY emp_id DESC";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, buseo_code);
		rs = pstmt.executeQuery();
		
		if( rs.next() ) {
			
			do {
				Employee emp = new Employee();
				emp.setEmp_id( rs.getInt("emp_id") );
				emp.setEmp_name(rs.getString("emp_name"));
				emp.setEmp_email(rs.getString("emp_email"));
				emp.setEmp_addr(rs.getString("emp_addr"));
				emp.setBuseo_code(rs.getString("buseo_code"));
				
				empList.add(emp);
				
			}while(rs.next());
			
		}
		
		return empList;
	}
	
}








