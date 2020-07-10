package ex01;

public class Sample {

	public static void main(String[] args) {
		// students();
		cars();
	}
	
		public static void students() {
			Student s1=new Student(); // 생성자(기본생성자 생략)
			s1.sno = "01";
			s1.sname = "홍길동";
			s1.tel = "010-0000-0000";
			s1.printStudent(s1);
			
			Student s2=new Student();
			s2.sno = "02";
			s2.sname = "심청이";
			s2.tel = "010-1111-1111";
			s2.printStudent(s2);
			
			Student s3=new Student("03", "강감찬", "010-2222-2222");
			s3.printStudent(s3);
		}
		
		public static void cars() {
			Car car1=new Car();
			car1.color = "검정색";
			car1.model = "그랜저";
			car1.maxSpeed = 250;
			car1.printCar(car1);
			
			Car car2=new Car();
			car2.color = "하얀색";
			car2.model = "소나타";
			car2.maxSpeed = 250;
			car2.printCar(car2);
			
			Car car3=new Car("미니쿠페", "파란색", 250);
			car3.printCar(car3);
		}
}