package ex02;

public class Car {
	// 필드(속성)
	// 필드의 값을 마음대로 바꿀수 없도록 하기위해 private을 사용
			private String company;
			private int maxSpeed;
			
			// set()메서드
			public void setCompany(String company) {
				this.company=company;
			}
			public void setMaxSpeed(int maxSpeed) {
				if(maxSpeed < 0) {
					this.maxSpeed=0;
				}else {
					this.maxSpeed=maxSpeed;
				}
			}
			//get()메서드
			public String getCompany() {
				return company;
			}
			public int getMaxSpeed() {
				return maxSpeed;
			}
			
			// 생성자(기본)
			Car(){
			}
			
			// 메서드(동작)
			void printCar() {
				System.out.println("제조사 : " + company);
				System.out.println("최대속도 : " + maxSpeed);
			}
} // class