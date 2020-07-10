package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		/* // 변수타입
		int intNum1 = 10, intNum2 = 20;
		double dblNum1 = 10.3, dblNum2 = 20.4;
		char chr1 = 'A', chr2 = 'B';
		String str1 = "홍길동", str2 = "심청이";
		String str3 = new String("홍길동"); // String은 참조타입이기에 가능
		
		System.out.println("intNum1 = " + intNum1); // 결과 : intNum1 = 10
		
		
		// 연산자
		// 1.산술연산자(+, -, *, /, %)
		int intResult1 = intNum1 + intNum2;
		System.out.println("intNum1 + intNum2 = " + intResult1); // 결과 : intNum1 + intNum2 = 30
		double dblResult1 = dblNum1 + dblNum2;
		System.out.println("dblNum1 + dblNum2 = " + dblResult1); // 결과 : dblNum1 + dblNum2 = 30.7
		int dblResult2 = (int)dblNum1 - (int)dblNum2; // 강제형변환
		System.out.println("dblNum1 - dblNum2 = " + dblResult2); // 결과 : dblNum1 - dblNum2 = -10
		
		// 2.비교연산자(==, !=, >=, <=, >, <)
		if(intNum1!=intNum2) {
			System.out.println("두 수가 같습니다.");
		}else {
			System.out.println("두 수가 같지 않습니다.");
		} // 결과 : 두 수가 같습니다.
		
		if(str1.equals(str2)) {
			System.out.println("같다.");
		}else {System.out.println("같지않다.");
		} // 결과 : 같지않다.
		
		// 3.논리연산자(!, &&, ||)
		boolean isRun;
		isRun = (intNum1 >= 10) && (intNum2 >= 20); // 두 조건이 모두 true여야만 true로 출력
		if(isRun) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		// 조건문
		int score = 97;
		// 점수가 90점 이상이면 A출력
		// 점수가 80점 이상이면 B출력
		// 점수가 70점 이상이면 C출력
		// 점수가 70점 미만이면 F출력
		// if-else if-else문 사용
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		} // 결과 : A
		
		// 100~95점 사이면 A+
		// 94~90점 사이면 A0
		if(score <= 100 && score >= 95) {
			System.out.println("A+");
		}else if(score < 95 && score >= 90) {
			System.out.println("A0");
		} // 결과 : A+
		
		// 반복문
		int sum = 0;
		// 1부터 100까지의 합계
		for(int i=1; i<=100; i++) { // 여기서 i는 for문 안에서만 쓸수 있는 지역변수
			sum = sum + i;
		}
		System.out.println("100까지의 합계 = " + sum); // 결과 : 100까지의 합계 = 5050
		
		sum = 0;
		int i = 1;
		while (i<=100) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("100까지의 합 = " + sum); // 결과 : 100까지의 합 = 5050 */
		
		Scanner s=new Scanner(System.in);
	/*	while(true) {
			int stop=s.nextInt();
			if(stop==0) {
				break;
			}
			System.out.println("----------");
		}
		System.out.println("프로그램 종료"); */
		
		// 배열
		int[] num1 = {1, 2, 3, 4, 5}; // 값을 지정하는 법
		int[] num2 = new int[5]; // 키보드로 직접 입력하는 법
		int sum = 0;
		
		for(int j=0; j<num1.length; j++) {
			System.out.print(num1[j]); // 결과 : 12345
			sum = sum + num1[j];
		}
		System.out.println("합계 = " + sum); // 결과 : 합계 = 15
		System.out.println("평균 = " + (double)sum/num1.length); // 결과 : 평균 = 3.0
		
		int[] number = null; // 배열 선언(생성X)
		System.out.print("배열크기 > ");
		int count = s.nextInt(); // 배열크기를 키보드에서 입력
		number = new int[count]; // 배열 생성 (int를 붙이면 생성하면서 선언도 가능)
		
		sum = 0; // 합계저장변수 초기화
		for(int j=0; j<count; j++) { // 0~배열크기만큼 반복
			System.out.print("값 [" + j + "] > ");
			number[j] = s.nextInt(); // 입력값을 j번째방에 저장
			sum = sum + number[j]; // j번째 값을 sum에 누적
		}
		System.out.println("합계 = " + sum);
		
	} // main
} // class
