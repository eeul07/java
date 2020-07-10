package ex06;

public class Sample {

	public static void main(String[] args) {
		System.out.println("********************매출보고서**********************");
		System.out.println("---------------------------------------------------");
		System.out.println("상품명\t수량\t단가\t금액\t비고");
		System.out.println("---------------------------------------------------");
		String[] name = {"냉장고", "세탁기", "에어컨"};
		int[] amount = {2, 3, 5};
		int[] price = {300, 100, 150};
		String[] remark = new String[3];
		int total = 0;
		
		for(int i=0; i<=2; i++) {
			int sum = amount[i] * price[i];
			total = total + sum;
			
			if(sum>=700) {
				remark[i] = "최우수";
			}else if(sum>=500) {
				remark[i] = "우수";
			}else {
				remark[i] = "보통";
			}
			System.out.println(name[i] + "\t" + amount[i] + "\t" + price[i] + "\t" + sum + "\t" + remark[i]);
	
		}
		System.out.println("---------------------------------------------------");
		System.out.println("total\t\t\t" + total);
		System.out.println("---------------------------------------------------");
		
	}

}
