package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("[1]1~100까지의 합계");
		System.out.println("[2]1~100까지의 짝수합계");
		System.out.println("[3]1~100까지의 홀수합계");
		System.out.println("[4]프로그램종료\n");
		
		boolean run=true;
		
		while(run) {
		Scanner s=new Scanner(System.in);
		System.out.print("\n메뉴선택[1~4]?");
		int menu=s.nextInt();
		
		int sum=0;
		switch(menu) {
		case 1:
			System.out.println("\n---1~100까지의 합계---");
			for(int i=1; i<=100; i=i+1) {
				sum=sum+i;
			}
			System.out.println(sum);
			break;
		case 2:
			System.out.println("\n---1~100까지의 짝수합계---");
			for(int i=0; i<=100; i=i+2) {
				sum=sum+i;
			}
			System.out.println(sum);
			break;
		case 3:
			System.out.println("\n---1~100까지의 홀수합계---");
			for(int i=1; i<=100; i=i+2) {
				sum=sum+i;
			}
			System.out.println(sum);
			break;
		case 4:
			System.out.println("\n프로그램이 종료되었습니다.");
			run=false;
			break;
		default:
			System.out.println("\n잘못된 입력입니다.");	
				
		}
		}
	}

}
