package ex02;

// 계산기 클래스
public class Calculator {
	// 필드(속성)
	int x;
	int y;
	
	// 생성자(객체생성)
	Calculator(){
	}
	
	// 일반생성자
	Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// 메서드(동작)
	
	// 더하기 메서드
	int plus(int x, int y) {
		int result = x + y;
		return result;	
	}
	// 빼기 메서드
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	// 곱하기 메서드
		int mult(int x, int y) {
			int result = x * y;
			return result;
		}
	// 나누기 메서드
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
}
