package ex02;

// ���� Ŭ����
public class Area {
	
	// �ﰢ������
	static double triangle(int x, int y) {
		System.out.println("�ﰢ������");
		return x*y/2.;
	}
	
	// ���簢������
	static int rectangle(int x, int y) {
		System.out.println("���簢������");
		return x*y;
	}
	
	// ���簢������
	static int rectangle(int x) {
		System.out.println("���簢������");
		return x*x;
	}
	// �޼��嵵 �����ε��� ����
	
	// ���ǳ���
	static double circle(int r) {
		System.out.println("���ǳ���");
		final double pi = 3.141597; // final : �������� ������
		return r*r*pi;
	}
}