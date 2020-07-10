package ex01;

public class Sample {

	public static void main(String[] args) {
		// 배열에 있는 데이타들에 대한 평균값과 최대값
		int[] num = {98, 50, 77, 20, 60, 88, 99, 45, 90, 80, 56};
		int sum = 0;
		int max = 0;
		int min = 99999;
		
		for(int i=0; i<=num.length-1; i++) {
			sum = sum + num[i];
			if(num[i]>max) {
				max = num[i];
			}
			if(num[i]<min) {
				min = num[i];
			}
		}
		double avg = (double)sum / num.length;
		System.out.println("평균:" + avg);
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
	}

}


