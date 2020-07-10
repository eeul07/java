package ex01;

// phone을 상속받는 자식class
public class DmbPhone extends Phone {
	// 필드
	int channel;
	
	//기본생성자 (오버로딩 - 매개변수의 개수나 타입이 달라야만 가능)
	DmbPhone() {		
	}
	
	// 일반생성자
	DmbPhone(String model, String color, int channel) { // Phone의 필드 사용가능
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	// 메서드
	void trunOnDmb() {
		System.out.println(channel + "번 DMB 방송을 수신합니다.");
	}
	void changeChannel(int channel) {
		System.out.println(channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	// 위의 메서드 이외에 Phone의 메소드도 사용가능
} // class
