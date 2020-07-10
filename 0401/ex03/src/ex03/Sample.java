package ex03;

import java.util.*;

public class Sample {

	public static void main(String[] args) {
	/*	Report r=new Report();
		r.setSno("01");
		r.setSname("홍길동");
		r.setKor(90);
		r.setEng(100);
		r.setMat(77);
		// r.printList();
		r.printReport(); 
	
		Report[] report=new Report[2];
		report[0]=new Report();
		report[0].setSno("01");
		report[0].setSname("홍길동");
		report[0].setKor(90);
		report[0].setEng(90);
		report[0].setMat(90);
		
		report[1]=new Report();
		report[1].setSno("02");
		report[1].setSname("심청이");
		report[1].setKor(80);
		report[1].setEng(80);
		report[1].setMat(80);
		
		for(int i=0; i<report.length; i++) {
			report[i].printList();
		} */
		
		//ArrayList 사용(컬렉션)
		ArrayList<Report> array=new ArrayList<Report>();
		Report r = new Report();
		r.setSno("01");
		r.setSname("홍길동");
		r.setKor(90);
		r.setEng(90);
		r.setMat(90);
		array.add(r);
		
		r=new Report();
		r.setSno("02");
		r.setSname("심청이");
		r.setKor(80);
		r.setEng(80);
		r.setMat(80);
		array.add(r);
		
		for(int i=0; i<array.size(); i++) {
			r=array.get(i);
			r.printList();
		}
		
	} // main method
} // class
