package ex01;

public class Sample {

	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.powerOn();
		p1.reciveVoice("��������!");
		 p1.sendVoice("���� ȫ�浿�Դϴ�.");
		 p1.hangup();
		 p1.powerOff();
		 System.out.println();
		 
		 DmbPhone d1=new DmbPhone("�Ｚ��Ʈ", "�Ķ�", 11);
		 d1.powerOn();
		 d1.trunOnDmb();
		 d1.changeChannel(9);
		 d1.turnOffDmb();
		 System.out.println();
		 
	} // main method
} // class
