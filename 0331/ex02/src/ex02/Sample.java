package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// cal();
		// Area a1=new Area();
		System.out.println(Area.triangle(5, 5));
		System.out.println(Area.rectangle(5, 5));
		System.out.println(Area.rectangle(5));
		System.out.println(Area.circle(5));
	}
	
	public static void cal() {
		Scanner s=new Scanner(System.in);
		System.out.print("x=");
		int x = s.nextInt();
		
		System.out.print("y=");
		int y = s.nextInt();
		
		Calculator c1=new Calculator(x, y); // ������
		
	//	System.out.println("x=" + c1.x);
	//	System.out.println("y=" + c1.y);
		System.out.println("x+y=" + c1.plus(x, y));
		
		System.out.println("x-y=" + c1.minus(x, y));
		
		System.out.println("x*y=" + c1.mult(x, y));
		
		double result = c1.divide(x, y);
		System.out.println("x/y=" + result);
		
		c1.powerOn();
	}

}
