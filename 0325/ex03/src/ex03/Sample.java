package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
		System.out.println("----------------");
		System.out.println("1.증속 | 2.감속 | 3.중지");
		System.out.println("----------------");
		System.out.print("선택:");
		int menu=s.nextInt();
			
		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			run=false;
			System.out.println("중지 되었습니다");
			break;
		default:
			System.out.println("잘못된 입력입니다");
			
		}
		}
	}

}
