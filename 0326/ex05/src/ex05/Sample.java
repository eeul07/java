package ex05;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		String[] no=new String[100];
		String[] name=new String[100];
		int[] kor=new int[100];
		int[] eng=new int[100];
		int[] mat=new int[100];
		int count = 0; // 성적갯수
		String num = null;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("| 1.성적입력 | 2.성적목록 | 3.성적조회 | 4.종료 |");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			int menu=s.nextInt();
			int i=0;
			
			switch(menu) {
			case 1:
				System.out.println("-------------------------------------------------");
				System.out.println("성적입력");
				System.out.println("-------------------------------------------------");
				
				System.out.print("번호>");
				no[count] = s.next();
				System.out.print("성명>");
				name[count] = s.next();
				System.out.print("국어>");
				kor[count] = s.nextInt();
				System.out.print("영어>");
				eng[count] = s.nextInt();
				System.out.print("수학>");
				mat[count] = s.nextInt();
				
				System.out.println("결과:성적입력완료");
				count=count+1;
				break;
			case 2:
				System.out.println("-------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t평균");
				System.out.println("-------------------------------------------------");
				
				for(i=0; i<=count-1; i++) {
					int sum = kor[i]+eng[i]+mat[i];
					double avg = (double)sum / 3;
					System.out.print(no[i] + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + avg + "\n");
					}
				break;
			case 3:
				System.out.println("-------------------------------------------------");
				System.out.println("성적조회");
				System.out.println("-------------------------------------------------");
				System.out.print("번호>");
				num=s.next();
				for(i=0; i<=count-1; i++) {
					if(no[i].equals(num)){
						System.out.println("성명:" + name[i] + "\n국어:" + kor[i] + "\n영어:" + eng[i] + "\n수학:" + mat[i]);
					}
				}
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
			
		}

	}

}
