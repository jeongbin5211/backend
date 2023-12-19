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
	
	// static 으로 선언하면 생성자 필요없음
	DBConnect db = new DBConnect();
	
	List<Buseo> list = new ArrayList<Buseo>();
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Buseo> getBuseoAll() throws SQLException {
		conn = db.getConnection();
		
		String sql = "select * from buseo order by buseo_code asc";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		if (rs.next()) {
			do {
				// 객체에 담아서 리스트 배열에 저장해서 jsp 넘기기
				Buseo buseo = new Buseo();
				buseo.setBuseo_code(rs.getString("buseo_code"));
				buseo.setBuseo_name(rs.getString("buseo_name"));
				
				list.add(buseo);
				
			} while(rs.next());
		}
		
		return list;
	}
	
	// 입력
	public int insertEmployee(Employee emp) throws SQLException {
		conn = db.getConnection();
		
		String sql = "insert into employees values(emp.seq.nextval, ?, ?, ?, ?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, emp.getEmp_name());
		pstmt.setString(2, emp.getEmp_email());
		pstmt.setString(3, emp.getEmp_addr());
		pstmt.setString(4, emp.getBuseo_code());
		
		int row = pstmt.executeUpdate();
		
		return row;
	}
	
	// 삭제
	public void deleteEmployee() {
		
	}
	
	// 1명 출력
	public Employee getEmployeeOne(int emp_id) {
		
		return null;
	}
	
	// 출력
		public List<Employee> getEmployeeAll() throws SQLException {
			conn = db.getConnection();
			String sql = "select * from employees order by emp_id desc";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "");
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				do {
					Employee emp = new Employee();
					emp.setEmp_id(rs.getInt("emp_id"));
					emp.setEmp_name(rs.getString("emp_name"));
					emp.setEmp_email(rs.getString("emp_email"));
					emp.setEmp_addr(rs.getString("emp_addr"));
					emp.setBuseo_code(rs.getString("buseo_code"));
					
					
				}while(rs.next());
				
			}
			
			return empList;
		}
	
	// 수정
	public void updateEmployee() {
		
	}
}
