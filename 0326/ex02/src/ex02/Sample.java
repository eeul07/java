package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run = true;
		int[] scores = null;
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("| 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택>");
			int menu=s.nextInt();
			int i=0;
			int sum = 0;
			int max = 0;
			double avg = 0;
			
		switch(menu) {
			case 1:
				System.out.print("학생수>");
				int count = s.nextInt();
				scores = new int[count];
				break;
			case 2:
				for(i=0; i<=scores.length-1; i++) {
					System.out.print("점수[" + i + "] > ");
					scores[i] = s.nextInt();
				}
				break;
			case 3:
				for(i=0; i<=scores.length-1; i++) {
				System.out.println("점수[" + i + "] : " + scores[i]);
				}
				break;
			case 4:
			for(i=0; i<=scores.length-1; i++) {
				if(scores[i] > max) {
					max = scores[i];
					}
				}
				System.out.println("최고점수 : " + max);
				
			for(i=0; i<=scores.length-1; i++) {
				sum = sum + scores[i];
				avg = (double)sum / scores.length;
				}
				System.out.println("평균점수 : " + avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다");	
			}
		}
	}
	
}
