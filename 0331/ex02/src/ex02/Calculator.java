package ex02;

// ���� Ŭ����
public class Calculator {
	// �ʵ�(�Ӽ�)
	int x;
	int y;
	
	// ������(��ü����)
	Calculator(){
	}
	
	// �Ϲݻ�����
	Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// �޼���(����)
	
	// ���ϱ� �޼���
	int plus(int x, int y) {
		int result = x + y;
		return result;	
	}
	// ���� �޼���
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	// ���ϱ� �޼���
		int mult(int x, int y) {
			int result = x * y;
			return result;
		}
	// ������ �޼���
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
}
