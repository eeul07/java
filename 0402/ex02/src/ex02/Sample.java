package ex02;

public class Sample {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.r=5;
		double area=c1.areaCircle();
		System.out.println("¿øÀÇ³ÐÀÌ : " + c1.areaCircle());

		Computer c2=new Computer();
		c2.r=5;
		System.out.println("¿øÀÇ³ÐÀÌ : " + c2.areaCircle());
		
	} // main method
} // class
