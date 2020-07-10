package ex02;

// 넓이 클래스
public class Area {
	
	// 삼각형넓이
	static double triangle(int x, int y) {
		System.out.println("삼각형넓이");
		return x*y/2.;
	}
	
	// 직사각형넓이
	static int rectangle(int x, int y) {
		System.out.println("직사각형넓이");
		return x*y;
	}
	
	// 정사각형넓이
	static int rectangle(int x) {
		System.out.println("정사각형넓이");
		return x*x;
	}
	// 메서드도 오버로딩이 가능
	
	// 원의넓이
	static double circle(int r) {
		System.out.println("원의넓이");
		final double pi = 3.141597; // final : 변수값을 고정함
		return r*r*pi;
	}
}