package ex01;

public class Car {
	// 필드(속성)
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	// 기본생성자
	Car(){
	}
	
	// 일반생성자
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 출력메서드(동작)
	void printCar(Car car) {
		System.out.println("-------자동차 정보-------");
		System.out.println("회사:" + car.company);
		System.out.println("모델:" + car.model);
		System.out.println("색상:" + car.color);
		System.out.println("최대속도:" + car.maxSpeed);
	}
}
