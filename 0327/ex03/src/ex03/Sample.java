package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {

	public static void main(String[] args)throws Exception {
		// oracle Database 접속
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver); // driver를 로딩(불러오는것)
		Connection con=DriverManager.getConnection(url, user, password); // Connection하는 작업(연결)

		String sql="select * from tbl_grade order by kor+eng+mat desc";
		PreparedStatement ps=con.prepareStatement(sql); // connection한 sql을 불러오기
		ResultSet rs=ps.executeQuery(); // ps에 들어가 있는 sql문을 실행
		
		while(rs.next()) {
			int kor=rs.getInt("kor");
			int mat=rs.getInt("mat");
			int eng=rs.getInt("eng");
			int sum=kor+mat+eng;
			double avg=(double)sum/3;
					
			System.out.print(rs.getString("sno") + "\t");
			System.out.print(rs.getString("sname") + "\t");
			System.out.print(rs.getInt("kor") + "\t");
			System.out.print(rs.getInt("mat") + "\t");
			System.out.println(rs.getInt("eng"));
			
			System.out.println("합계:" + sum);
			System.out.println("평균:" + avg);
		}
	}
}
