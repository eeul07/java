package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		
		System.out.println("[1]�������α׷�");
		System.out.println("[2]���ǳ��̱��ϱ�");
		System.out.println("[3]�ﰢ�����̱��ϱ�");
		System.out.println("[4]���α׷�����");
		
		Scanner s=new Scanner(System.in);
		System.out.print("�޴�����[1~4]?");
		int menu=s.nextInt();
		
		
		switch(menu) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			System.out.println("���α׷��� �����մϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public static void method1() {
		//�̸�, ����, ����, ���� Ű���忡�� �Է�
		//����, ��� ���
				
		Scanner s=new Scanner(System.in);
		System.out.print("�̸�>");
		String name=s.next();
		System.out.print("����>");
		int kor=s.nextInt();
		System.out.print("����>");
		int eng=s.nextInt();
		System.out.print("����>");
		int mat=s.nextInt();
				
		int sum=kor+eng+mat;
		double avg=(double)sum/3;
				
		System.out.println("����:" + sum);
		System.out.println("���:" + avg);
	}

	public static void method2() {
		//���� �������� �Է¹޾� ���� ���̸� ���Ѵ�.
		//�������� 0�̸� ���α׷� ����
		boolean run=true;
		
		while(run) {	
			Scanner s=new Scanner(System.in);
			System.out.print("���� ������:");
			int r=s.nextInt();
			double area=r * r * 3.14;
			System.out.println("���� ����:" + area + "\n");
			
			if(r==0) {
				System.out.print("���α׷� ����");
				run=false;
			}
		}
		
	}

	public static void method3() {
		//�ﰢ���� ���̿� �غ��� Ű���忡�� �Է¹޴´�.
		//�ﰢ���� ���̸� ���Ͽ� ����Ѵ�.
		boolean run=true;
		
		while(run) {
		Scanner s=new Scanner(System.in);
		System.out.print("�ﰢ�� ���̸� ���ϽǷ���(y/n)?");
		String q=s.next();
		
		if(q.equals("y") || q.equals("Y")) {
		System.out.print("����:");
		int h=s.nextInt();
		System.out.print("�غ�:");
		int w=s.nextInt();
		double area=h * w * 1/2.;
		System.out.println("�ﰢ���� ����:" + area);
		}else if(q.contentEquals("n") || q.contentEquals("N")) {
			System.out.println("���α׷� ����");
			run=false;
		}else {
			System.out.println("�߸� �Է��߾��.");
		}
		}
	}
	
} //class
