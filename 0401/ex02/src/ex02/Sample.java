package ex02;

public class Sample {

	public static void main(String[] args) {
		Car c1=new Car(); // Car가 클래스이고 c1이 객체
		// c1.company="현대";
		// c1.maxSpeed=200;
		// c1.printCar();
		
		c1.setCompany("삼성");
		System.out.println("제조사 : " + c1.getCompany());	
		c1.setMaxSpeed(-120);
		System.out.println("최대속도 : " + c1.getMaxSpeed());
		
	} // main method
} // class