package ex03;

public class Sample {

	public static void main(String[] args) {
		/*
		Grade g1=new Grade("01", "홍길동", 90, 80, 90);
		g1.printGrade(g1);
		
		Grade g2=new Grade("02", "심청이", 95, 88, 75);
		g2.printGrade(g2);
		*/
		
		Grade[] grade=new Grade[2];
		grade[0]=new Grade("01", "홍길동", 90, 70, 77);
		grade[1]=new Grade("02", "심청이", 60, 60, 67);
		
		for(int i=0; i<grade.length; i++) {
			grade[i].printGrade();
		}
	}
}
