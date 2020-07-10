package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int[] num = null;
		int count = 0;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("| 1.배열생성 | 2.데이타입력 | 3.데이타출력 | 4.종료 |");
			System.out.println("------------------------------------------");
			System.out.print("선택>");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("배열크기>");
				count = s.nextInt();
				num = new int[count];
				break;
			case 2:
				for(int i=0; i<=count-1; i++) {
				System.out.print("숫자" + i + ">");
				num[i] = s.nextInt();
				}
				break;
			case 3:
				int sum = 0;
				double avg = 0;
				for(int i=0; i<=count-1; i++) {
				System.out.println("숫자" + i + ":" + num[i]);
				sum = sum + num[i];
				avg = (double)sum / count;
				}
				System.out.println("총점:" + sum);
				System.out.println("평균:" + avg);
				break;
			case 4:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	} // main

} // class
