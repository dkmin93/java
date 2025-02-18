package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate {
	
	public static void main(String[] args) {
		
		//업데이트도 insert와 동일하다.
		//회원번호, 이름, 주소를 입력받아서 해당 회원의 이름과 주소를 변경하기
		//회원번호가 없으면 없다고 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회원번호를 입력해주세요>>");
		int inputNum = scan.nextInt();
		System.out.println("이름을 입력해주세요>>");
		String inputName = scan.next();
		System.out.println("주소를 입력해주세요>>");
		String inputAddress = scan.next();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "UPDATE MEMBERS SET NAME = '" + inputName + "', ADDRESS = '" + inputAddress + "' WHERE MNO = " + inputNum;
	 // String sql = "UPDATE MEMBERS SET NAME = ?, ADDRESS = ? WHERE MNO = ?";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			//pstmt.setString(1, inputName); 첫번째 물음표 타입 지정 및 값 변경
			//pstmt.setString(2, inputAddress); 두번째~
			//pstmt.setString(3, inputNum); 세번째~
			
			
			
			int result = pstmt.executeUpdate(); // 1 또는 0 반환
			
			if(result == 1) { // 정상적으로 작동
				System.out.println("정상적으로 변경되었습니다");
			} else { // 오류
				System.out.println("입력 실패입니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
	
	
	
	
	
	
	
	}

}
