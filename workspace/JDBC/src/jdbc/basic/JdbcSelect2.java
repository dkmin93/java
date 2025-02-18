package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

public class JdbcSelect2 {

	public static void main(String[] args) {

		//회원번호를 입력 받아서 해당 번호 회원 정보만 출력하는 jdbc 프로그램을 작성
		//회원번호가 없으면 "회원번호는 없습니다"로 출력

		Scanner scan = new Scanner(System.in);

		System.out.println("회원번호를 입력해주세요>>");
		int inputNumber = scan.nextInt();

		Connection conn = null; //연결 객체
		PreparedStatement pstmt = null; //sql문을 실행하기 위한 객체
		ResultSet rs = null; // sql을 실행한 결과를 반환 받을 객체

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";

		String sql = "SELECT * FROM MEMBERS WHERE MNO IN(" + inputNumber +")";

		try {

			//1. 드라이버 클래스
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//2. conn
			conn = DriverManager.getConnection(url, uid, upw);

			//3. pstmt
			pstmt = conn.prepareStatement(sql);

			//4. 실행
			rs = pstmt.executeQuery();

			//select문의 다음행이 있다면 true를 반환
			
			
			if(rs.next()) {
				int mno	= rs.getInt("mno"); //컬럼명
				String name = rs.getString("name");
				String address = rs.getString("address");
				//String regdate = rs.getString("regdate"); //날짜를 문자열 타입
				//Date regdate = rs.getDate("regdate"); //날짜를 date 타입
				Timestamp regdate = rs.getTimestamp("regdate"); //날짜를 밀리초까지 보여주는 Timestamp타입

				System.out.println(mno + ", " + name + ", " + address + ", " +regdate);
			} else {
				System.out.println("유효하지 않는 회원번호 입니다");
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
