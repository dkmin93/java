package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

public class JdbcSelect3 {
	
	public static void main(String[] args) {
		
		//테이블은 employees, departments
		
		//회원 번호를 입력 받아서 회원의 이름, 급여, 부서아이디, 부서명을 출력하는 join문장
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your EMPLOYEE_ID>>");
		int id = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";

		String sql = "SELECT FIRST_NAME, SALARY, E.DEPARTMENT_ID, DEPARTMENT_NAME\r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "LEFT JOIN DEPARTMENTS D\r\n"
				+ "ON E.DEPARTMENT_ID = D.DEPARTMENT_ID WHERE EMPLOYEE_ID ='" + id + "'";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //rs.next가 참이면 전부 스캔 커서 역할
				
				String name = rs.getString("FIRST_NAME");
				int salary = rs.getInt("SALARY");
				String departmentid = rs.getString("DEPARTMENT_ID");
				String departmentname = rs.getString("DEPARTMENT_NAME");
				
				

				System.out.println(name + ", " + salary + ", " + departmentid + ", " + departmentname);
			} else {
				System.out.println("Invalid EMPLOYEE_ID");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();

			} catch (Exception e2) {

			}
		}
		
		
		
		
		
		
		
		
	}

}
