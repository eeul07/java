package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception {
		// oracle Database 접속
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		Class.forName(driver); // driver를 로딩(불러오는것)
		Connection con=DriverManager.getConnection(url, user, password); // Connection하는 작업(연결)
		
		// spl
		String sql="insert into tbl_grade(sno, sname) values(?, ?)";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner s=new Scanner(System.in);
		System.out.print("번호>");
		String sno=s.next();
		System.out.print("성명>");
		String sname=s.next();
		
		ps.setString(1, sno);
		ps.setString(2, sname);
		ps.execute(); // 실행
		
		System.out.println("입력완료");
	}
}
