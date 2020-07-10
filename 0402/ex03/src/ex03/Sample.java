package ex03;

import java.sql.*;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		while(run) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("| 1.성적입력 | 2.성적조회 | 3.성적수정 | 4.성적삭제 | 5.종료 |");
		System.out.println("-----------------------------------------------------------");
		System.out.print("메뉴입력>");
		int menu=s.nextInt();
		
		switch(menu) {
		case 1: // 입력
			System.out.println("-----------------------------------------------------------");
			System.out.println("성적입력중");
			System.out.println("-----------------------------------------------------------");
			SungjukVO vo=new SungjukVO();
			boolean find=false;
			
			while(find==false) {
			System.out.print("번호>");
			vo.setSno(s.next());
			sql="select * from tbl_student where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getSno()); 
			rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("이름:" + rs.getString("sname"));
				System.out.print("몇월>");
				vo.setSmonth(s.next());
				System.out.print("국어>");
				vo.setKor(s.nextInt());
				System.out.print("영어>");
				vo.setEng(s.nextInt());
				System.out.print("수학>");
				vo.setMat(s.nextInt());
				sql="insert into tbl_sungjuk(sno, smonth, kor, eng, mat) values(?, ?, ?, ?, ?)";
				ps=con.prepareStatement(sql);
				ps.setString(1, vo.getSno());
				ps.setString(2, vo.getSmonth());
				ps.setInt(3, vo.getKor());
				ps.setInt(4, vo.getEng());
				ps.setInt(5, vo.getMat());
				ps.execute();
				System.out.println("저장완료\n");
				find=true;
			}else {
				System.out.println("학생이 존재하지 않습니다.");
			}
		}
			break;
		case 2: // 조회
			find=false; // 번호를 못찾음
			while(find==false) { // 못찾으면 찾을때까지 계속입력
			System.out.print("번호>");
			String sno=s.next();
			sql="select * from tbl_student where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, sno);
			rs=ps.executeQuery();
			if(rs.next()) { // 찾은경우
				System.out.println("성명:" + rs.getString("sname"));
				sql="select * from tbl_sungjuk where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				rs=ps.executeQuery();
				System.out.println("-----------------------------------------------------------");
				System.out.println("월\t국어\t영어\t수학\t평균");
				System.out.println("-----------------------------------------------------------");
				while(rs.next()) {
					System.out.print(rs.getString("smonth") + "\t");
					System.out.print(rs.getInt("kor") + "\t");
					System.out.print(rs.getInt("eng") + "\t");
					System.out.print(rs.getInt("mat") + "\t");
					double avg=(rs.getInt("kor")+rs.getInt("eng")+rs.getInt("mat"));
					System.out.println(avg);
				}
				System.out.println();
				find=true;
			}else { // 못찾은경우
				System.out.println("학생이 존재하지 않습니다.");
			}
			}
			break;
		case 3: // 수정
			System.out.println("-----------------------------------------------------------");
			System.out.println("성적수정중");
			System.out.println("-----------------------------------------------------------");
			find=false;
			while(find==false) {
			System.out.print("번호>");
			String sno=s.next();
			sql="select * from tbl_student where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, sno);
			rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("이름:" + rs.getString("sname"));
				System.out.print("몇월>");
				String smonth=s.next();
				sql="select * from tbl_sungjuk where smonth=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, smonth);
				rs=ps.executeQuery();
				if(rs.next()) {
					vo=new SungjukVO();
					System.out.print("국어(" + rs.getInt("kor") + ")>");
					vo.setKor(s.nextInt());
					System.out.print("영어(" + rs.getInt("eng") + ")>");
					vo.setEng(s.nextInt());
					System.out.print("수학(" + rs.getInt("mat") + ")>");
					vo.setMat(s.nextInt());
					sql="update tbl_sungjuk set kor=?, eng=?, mat=? where sno=? and smonth=?";
					ps=con.prepareStatement(sql);
					ps.setInt(1, vo.getKor());
					ps.setInt(2, vo.getEng());
					ps.setInt(3, vo.getMat());
					ps.setString(4, sno);
					ps.setString(5, smonth);
					ps.execute();
					System.out.println("수정완료\n");
					find=true;
				}else {
					System.out.println("해당 월의 데이터가 없습니다.\n");
				}
			}else {
				System.out.println("학생이 존재하지 않습니다.\n");
			}
			}
			break;
		case 4: // 삭제
			System.out.println("-----------------------------------------------------------");
			System.out.println("성적삭제중");
			System.out.println("-----------------------------------------------------------");
			find=false;
			while(find==false) {
			System.out.print("번호>");
			String sno=s.next();
			sql="select * from tbl_student where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, sno);
			rs=ps.executeQuery();
			if(rs.next()) {
			System.out.print("몇월>");
			String smonth=s.next();
			sql="select * from tbl_sungjuk where smonth=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, smonth);
			rs=ps.executeQuery();
			if(rs.next()) {
				sql="delete from tbl_sungjuk where sno=? and smonth=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				ps.setString(2, smonth);
				ps.execute();
				System.out.println("삭제완료\n");
				find=true;
			}else {
				System.out.println("해당 월의 데이터가 없습니다.\n");
			}
			}else {
				System.out.println("학생이 존재하지 않습니다.\n");
			}
			}
			break;
		case 5: // 종료
			run=false;
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		}
	} // main method
} // class