package ex02;

public class Sample {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 90, eng = 90, mat = 90;
		int tot = kor + eng + mat;
		double avg = tot / 3;
		String grade = "";
		
		if(avg >= 90) {
			if(avg >= 95) {
				grade = "A+";
			}else {
				grade = "A0";
			}
		}else if(avg >= 80) {
			if(avg >= 85) {
				grade = "B+";
			}else {
				grade = "B0";
			}
		}else if(avg >= 70) {
			if(avg >= 75) {
				grade = "C+";
			}else {
				grade = "C0";
			}			
		}else {
			
		}
		//성적표 출력
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);

		
		//판매액이 1000 이상이면 최우수
		//500 이상이면 우수
		//500 미만이면 보통
		String name2 = "냉장고"; //상품명
		int price = 100; //단가
		int number = 5; //수량
		int total = price * number; //판매액
		String remark = ""; //비고
		
		if(total >= 1000) {
			remark = "최우수";
		}else if(total >= 500) {
			remark = "우수";
		}else {
			remark = "보통";
		}
		//출력
		System.out.println("상품명 : " + name2);
		System.out.println("단가 : " + price);
		System.out.println("수량 : " + number);
		System.out.println("판매액 : " + total);
		System.out.println("비고 : " + remark);
		
	}
}
