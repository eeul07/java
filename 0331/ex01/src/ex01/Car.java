package ex01;

public class Car {
	// �ʵ�(�Ӽ�)
	String company = "����";
	String model;
	String color;
	int maxSpeed;
	
	// �⺻������
	Car(){
	}
	
	// �Ϲݻ�����
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// ��¸޼���(����)
	void printCar(Car car) {
		System.out.println("-------�ڵ��� ����-------");
		System.out.println("ȸ��:" + car.company);
		System.out.println("��:" + car.model);
		System.out.println("����:" + car.color);
		System.out.println("�ִ�ӵ�:" + car.maxSpeed);
	}
}
