package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		Grade[] grade=new Grade[100];
		int count=0;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("| 1.성적입력 | 2.성적목록 | 3.성적조회 | 4.종료 |");
			System.out.println("-------------------------------------------------");
			System.out.print("메뉴선택>");
			int menu=s.nextInt();
			
			switch(menu) {
			case 1: // 성적입력
				grade[count]=new Grade();
				System.out.print("학번>");
				grade[count].sno=s.next();
				System.out.print("이름>");
				grade[count].sname=s.next();
				System.out.print("국어>");
				grade[count].kor=s.nextInt();
				System.out.print("영어>");
				grade[count].eng=s.nextInt();
				System.out.print("수학>");
				grade[count].mat=s.nextInt();
				System.out.println("입력완료\n");
				count=count+1;
				break;
			case 2: // 성적목록
				for(int i=0; i<count; i++) {
					grade[i].printGrade();
				}
				System.out.println();
				break;
			case 3: // 성적조회
				System.out.print("조회할 학번>");
				String no=s.next();
				boolean find=false;
				for(int i=0; i<count; i++) {
					if(no.equals(grade[i].sno)) {
					/*	System.out.println("성명:" + grade[i].sname);
						System.out.println("국어:" + grade[i].kor);
						System.out.println("영어:" + grade[i].eng);
						System.out.println("수학:" + grade[i].mat);
						System.out.println("합계:" + grade[i].tot);
						System.out.println("평균:" + grade[i].avg);	*/
						grade[i].printGrade();
						find=true;
					}
				}
				if(find==false) {
						System.out.println("존재하지 않는 학번입니다.");	
				}
				System.out.println();
				break;
			case 4: // 종료
				run=false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
