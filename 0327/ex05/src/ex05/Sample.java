package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("| 1.성적입력 | 2.성적출력 | 3.종료 |");
			System.out.println("------------------------------------");
		    System.out.print("메뉴선택>");
		    int menu=s.nextInt();
		    
		    switch(menu) {
		    case 1:
				String sql="insert into tbl_grade(sno, sname) values(?, ?)";
				PreparedStatement ps=con.prepareStatement(sql);
				s=new Scanner(System.in);
				System.out.print("번호>");
				String sno=s.next();
				System.out.print("성명>");
				String sname=s.next();
				
				ps.setString(1, sno);
				ps.setString(2, sname);
				ps.execute(); // 실행
				
				System.out.println("입력완료");
		    	break;
		    case 2:
		    	String sql1="select * from tbl_grade order by kor+eng+mat desc";
				PreparedStatement ps1=con.prepareStatement(sql1); // connection한 sql을 불러오기
				ResultSet rs=ps1.executeQuery(); // ps에 들어가 있는 sql문을 실행
				
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
		    	break;
		    case 3:
		    	run=false;
		    	System.out.println("프로그램 종료");
		    	break;
		    default:
		    	System.out.println("잘못된 입력입니다.");
		    }
		}
	} // main
} // class