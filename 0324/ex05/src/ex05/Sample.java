package ex05;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		System.out.print("1:100합계 2:짝수합계 3:홀수합계");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		switch(number) {
		case 1:
			for2();
			break;
		case 2:
			for3();
			break;
		case 3:
			for4();
			break;
		}
	}

	//10까지 반복 출력
	public static void for1() {
		System.out.println("**예제1***");
		for(int i=0; i<=10; i+=2) { //i=i+2와 같다
			System.out.println(i);
		}
	}	
	
	//100까지의 합 출력
	public static void for2() {
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot=tot + i;
		}
		System.out.println("100까지의 합 : " + tot);
	}
	
	//0~100까지 짝수의 합 출력
	public static void for3() {
		int tot=0;
		for(int i=0; i<=100; i+=2) {
			tot=tot+i;
		}
		System.out.println("0~100까지 짝수의 합 : " + tot);
		
	}
	
	//0~100까지 홀수의 합 출력
	public static void for4() {
		int tot = 0;
		for(int i=1; i<=100; i+=2) {
			tot = tot + i;
		}
		System.out.println("0~100까지 홀수의 합 : " + tot);
	}
		
}
