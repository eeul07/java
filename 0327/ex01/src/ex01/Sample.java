package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		/* // ����Ÿ��
		int intNum1 = 10, intNum2 = 20;
		double dblNum1 = 10.3, dblNum2 = 20.4;
		char chr1 = 'A', chr2 = 'B';
		String str1 = "ȫ�浿", str2 = "��û��";
		String str3 = new String("ȫ�浿"); // String�� ����Ÿ���̱⿡ ����
		
		System.out.println("intNum1 = " + intNum1); // ��� : intNum1 = 10
		
		
		// ������
		// 1.���������(+, -, *, /, %)
		int intResult1 = intNum1 + intNum2;
		System.out.println("intNum1 + intNum2 = " + intResult1); // ��� : intNum1 + intNum2 = 30
		double dblResult1 = dblNum1 + dblNum2;
		System.out.println("dblNum1 + dblNum2 = " + dblResult1); // ��� : dblNum1 + dblNum2 = 30.7
		int dblResult2 = (int)dblNum1 - (int)dblNum2; // ��������ȯ
		System.out.println("dblNum1 - dblNum2 = " + dblResult2); // ��� : dblNum1 - dblNum2 = -10
		
		// 2.�񱳿�����(==, !=, >=, <=, >, <)
		if(intNum1!=intNum2) {
			System.out.println("�� ���� �����ϴ�.");
		}else {
			System.out.println("�� ���� ���� �ʽ��ϴ�.");
		} // ��� : �� ���� �����ϴ�.
		
		if(str1.equals(str2)) {
			System.out.println("����.");
		}else {System.out.println("�����ʴ�.");
		} // ��� : �����ʴ�.
		
		// 3.��������(!, &&, ||)
		boolean isRun;
		isRun = (intNum1 >= 10) && (intNum2 >= 20); // �� ������ ��� true���߸� true�� ���
		if(isRun) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		
		// ���ǹ�
		int score = 97;
		// ������ 90�� �̻��̸� A���
		// ������ 80�� �̻��̸� B���
		// ������ 70�� �̻��̸� C���
		// ������ 70�� �̸��̸� F���
		// if-else if-else�� ���
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		} // ��� : A
		
		// 100~95�� ���̸� A+
		// 94~90�� ���̸� A0
		if(score <= 100 && score >= 95) {
			System.out.println("A+");
		}else if(score < 95 && score >= 90) {
			System.out.println("A0");
		} // ��� : A+
		
		// �ݺ���
		int sum = 0;
		// 1���� 100������ �հ�
		for(int i=1; i<=100; i++) { // ���⼭ i�� for�� �ȿ����� ���� �ִ� ��������
			sum = sum + i;
		}
		System.out.println("100������ �հ� = " + sum); // ��� : 100������ �հ� = 5050
		
		sum = 0;
		int i = 1;
		while (i<=100) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("100������ �� = " + sum); // ��� : 100������ �� = 5050 */
		
		Scanner s=new Scanner(System.in);
	/*	while(true) {
			int stop=s.nextInt();
			if(stop==0) {
				break;
			}
			System.out.println("----------");
		}
		System.out.println("���α׷� ����"); */
		
		// �迭
		int[] num1 = {1, 2, 3, 4, 5}; // ���� �����ϴ� ��
		int[] num2 = new int[5]; // Ű����� ���� �Է��ϴ� ��
		int sum = 0;
		
		for(int j=0; j<num1.length; j++) {
			System.out.print(num1[j]); // ��� : 12345
			sum = sum + num1[j];
		}
		System.out.println("�հ� = " + sum); // ��� : �հ� = 15
		System.out.println("��� = " + (double)sum/num1.length); // ��� : ��� = 3.0
		
		int[] number = null; // �迭 ����(����X)
		System.out.print("�迭ũ�� > ");
		int count = s.nextInt(); // �迭ũ�⸦ Ű���忡�� �Է�
		number = new int[count]; // �迭 ���� (int�� ���̸� �����ϸ鼭 ���� ����)
		
		sum = 0; // �հ����庯�� �ʱ�ȭ
		for(int j=0; j<count; j++) { // 0~�迭ũ�⸸ŭ �ݺ�
			System.out.print("�� [" + j + "] > ");
			number[j] = s.nextInt(); // �Է°��� j��°�濡 ����
			sum = sum + number[j]; // j��° ���� sum�� ����
		}
		System.out.println("�հ� = " + sum);
		
	} // main
} // class
