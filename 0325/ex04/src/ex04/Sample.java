package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// 배열(참조타입)
		Scanner s=new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
		
		for(int i=0; i<=num.length-1; i++) {
			System.out.print(i + "번째값?");
			num[i]=s.nextInt();
			sum=sum+num[i];
		}
		System.out.println("합계:" + sum);
		
		/*
		int[] d= {90, 80, 100, 77, 85};
		int sum=0;
		for(int i=0; i<=d.length-1; i++) {
			System.out.println(i + "번째:" + d[i]);
			sum=sum + d[i];
		}
		System.out.println("합계:" + sum);
		double avg=(double)sum/d.length;
		System.out.println("평균:" + avg);
		*/
	}

}
