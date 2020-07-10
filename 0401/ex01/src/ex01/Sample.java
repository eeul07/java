package ex01;

import hankook.*;
import hyndai.*;
import kumho.*; // *은 모든 class를 다 import 한다는 의미

public class Sample {

	public static void main(String[] args) {
		SnowTire st=new SnowTire();
		hankook.Tire t1=new hankook.Tire(); // 한국일반타이어
		kumho.Tire t2=new kumho.Tire(); // 금호일반타이어
		Engine e=new Engine();
		BigWidthTire bt=new BigWidthTire();
	} // main method
} // class
