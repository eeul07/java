package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		// database 접속
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("| 1.입력 | 2.출력 | 3.삭제 | 4.수정 | 5.종료 |");
			System.out.println("----------------------------------------------");
			System.out.print("작업선택 > ");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1: // 입력
				System.out.print("번호 > ");
				String sno = s.next();
				System.out.print("이름 > ");
				String sname = s.next();
				System.out.print("국어 > ");
				int kor = s.nextInt();
				System.out.print("영어 > ");
				int eng = s.nextInt();
				System.out.print("수학 > ");
				int mat = s.nextInt();
				String sql = "insert into tbl_grade(sno, sname, kor, eng, mat, tot) values(?, ?, ?, ?, ?, ?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				ps.setString(2, sname);
				ps.setInt(3, kor);
				ps.setInt(4, eng);
				ps.setInt(5, mat);
				ps.setInt(6, kor+eng+mat);
				ps.execute(); // database에 data를 입력해주는 명령어
				System.out.println("데이터 입력완료");
				System.out.println();
				break;
			case 2: // 출력
				sql = "select * from tbl_grade order by sno";
				// order by [column name]
				ps=con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery(); // database에 data를 출력해주는 명령어(select에서만 사용)
				System.out.println("번호\t성명\t국어\t영어\t수학\t평균");
				while(rs.next()) { // rs의 내용이 있는 동안에 반복
					sno=rs.getString("sno");
					sname=rs.getString("sname");
					kor=rs.getInt("kor");
					mat=rs.getInt("mat");
					eng=rs.getInt("eng");
					System.out.print(sno + "\t");
					System.out.print(sname + "\t");
					System.out.print(kor + "\t");
					System.out.print(mat + "\t");
					System.out.print(eng + "\t");
					System.out.println((kor+mat+eng)/3.);
					System.out.println();
				}
				System.out.println();
				break;
			case 3: // 삭제
				System.out.print("번호 > ");
				sno = s.next();
				sql = "delete from tbl_grade where sno=?";
				ps = con.prepareStatement(sql);
				ps.setString(1,  sno);
				ps.execute();
				System.out.println("데이터 삭제완료");
				System.out.println();
				break;
			case 4: // 수정
				System.out.print("수정번호 > ");
				sno = s.next();
				sql = "select * from tbl_grade where sno = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, sno);
				rs = ps.executeQuery();
				if(rs.next()) {
					sname = rs.getString("sname");
					kor = rs.getInt("kor");
					eng = rs.getInt("eng");
					mat = rs.getInt("mat");
					System.out.println("성명 : " + sname);
					System.out.print("국어 : (" + kor + ")>");
					kor = s.nextInt();
					System.out.print("영어 : ("+ eng + ")>");
					eng = s.nextInt();
					System.out.print("수학 : ("+ mat + ")>");
					mat = s.nextInt();
					
					sql = "update tbl_grade set kor=?, eng=?, mat=? where sno=?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, kor);
					ps.setInt(2, eng);
					ps.setInt(3, mat);
					ps.setString(4, sno);
					ps.execute();
					System.out.println("데이터 수정완료");
					System.out.println();
				}else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 5: // 종료
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	} // main method
} // class