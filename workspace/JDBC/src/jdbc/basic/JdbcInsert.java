package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcInsert {
	
	public static void main(String[] args) {
		
		//이름, 주소를 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("이름>");
		String name = scan.nextLine();
		System.out.println("주소>");
		String address = scan.nextLine();
		
		Connection conn = null; //연결 객체
		PreparedStatement pstmt = null; //sql문을 실행하기 위한 객체
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "INSERT INTO MEMBERS(MNO, NAME, ADDRESS) VALUES(MEMBERS_SEQ.NEXTVAL, ?, ?)";
		
		try {
			//자바 sql패키지는 SQLException 예외를 던지고 있어서 트라이캐치 구문 안에서 실행해야 한다
			
			//1.드라이버클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.커넥션 객체 생성 (객체에 저장 꼭 하기!)
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3.pstmt객체 생성 (객체에 저장 꼭 하기!)
			pstmt = conn.prepareStatement(sql);
			
			//4.? 값을 채운다. ?는 순서대로 1번을 가진다. setString(), setDouble(), setInt()
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			
			//5.실행
			//select구문은 executeQuery()
			//insert, update, delete구문은 executeUpdate()
			
			int result = pstmt.executeUpdate(); //반환이 정수 
			
			if(result == 1) { // 1이면 성공
				System.out.println("정상 입력 되었습니다");
			} else { // 0이면 실패
				System.out.println("입력 실패입니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				conn.close();
				pstmt.close();
				// 닫아주는 작업 꼭 하기!
				
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
	}

}
