package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			boolean run=true;
			
			String[] num=new String[100]; // 계좌번호
			String[] name=new String[100]; // 계좌주
			int[] balance=new int[100]; // 잔액
			int count = 0; // 계좌갯수
			String no = null;
			
			while(run) {
				System.out.println("-------------------------------------------");
				System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
				System.out.println("-------------------------------------------");
				System.out.print("선택>");
				int menu = s.nextInt();
				int i=0;
				
			switch(menu) {
			case 1: // 계좌생성
				System.out.println("-------------------------------------------");
				System.out.println("계좌생성");
				System.out.println("-------------------------------------------");
				System.out.print("계좌번호 >");
				num[count] = s.next();
				System.out.print("계좌주 >");
				name[count] = s.next();
				System.out.print("초기입금액 >");
				balance[count] = s.nextInt();
				System.out.println("결과:계좌가 생성되었습니다.\n");
				
				count=count+1; // 계좌숫자 1증가
				break;
			case 2: // 계좌목록
				System.out.println("-------------------------------------------");
				System.out.println("계좌목록");
				System.out.println("-------------------------------------------");
				for(i=0; i<=count-1; i++) {
					System.out.println(num[i] + "\t" + name[i] + "\t" + balance[i]);
				}
				System.out.println();
				break;
			case 3: // 예금
				System.out.println("-------------------------------------------");
				System.out.println("예금");
				System.out.println("-------------------------------------------");
				
				System.out.print("계좌번호 >");
				no = s.next();
				System.out.print("입금액 >");
				int in = s.nextInt();
				boolean find=true;
				
				for(i=0; i<=count-1; i++) {
				if(num[i].equals(no)) {
					balance[i] = balance[i] + in;
					}
				}
				if(find) {
					System.out.println("결과:예금이 성공되었습니다.\n");
					find=false;
					}else {
						System.out.println("계좌가 없습니다.\n");
					}
				break;
			case 4: // 출금
				System.out.println("-------------------------------------------");
				System.out.println("출금");
				System.out.println("-------------------------------------------");
				
				System.out.print("계좌번호 >");
				no = s.next();
				System.out.print("출금액 >");
				int out = s.nextInt();
				find=true;
				
				for(i=0; i<=count-1; i++) {
				if(num[i].equals(no)) {
					balance[i] = balance[i] - out;
					}
				}
				if(find) {
					System.out.println("결과:출금이 성공되었습니다.\n");
					find=false;
					}else {
						System.out.println("계좌가 없습니다.\n");
					}
				break;
			case 5: // 종료
				run=false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				}
				
			}
				
		}
	}

