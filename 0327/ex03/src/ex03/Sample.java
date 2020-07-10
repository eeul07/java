package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {

	public static void main(String[] args)throws Exception {
		// oracle Database ����
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver); // driver�� �ε�(�ҷ����°�)
		Connection con=DriverManager.getConnection(url, user, password); // Connection�ϴ� �۾�(����)

		String sql="select * from tbl_grade order by kor+eng+mat desc";
		PreparedStatement ps=con.prepareStatement(sql); // connection�� sql�� �ҷ�����
		ResultSet rs=ps.executeQuery(); // ps�� �� �ִ� sql���� ����
		
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
			
			System.out.println("�հ�:" + sum);
			System.out.println("���:" + avg);
		}
	}
}
