package ex05;

public class Sample {

	public static void main(String[] args) {
		String[] name= {"ȫ�浿", "��û��", "������"};
		int[] kor= {96, 95, 64};
		int[] eng= {95, 80, 70};
		int[] mat= {97, 95, 77};
		int[] tot=new int[3];
		double[] avg=new double[3];
		int sumKor=0;
		int sumEng=0;
		int sumMat=0;
		int avgAvg=0;
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<=2; i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.;
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]);
		sumKor=sumKor+kor[i];
		sumEng=sumEng+eng[i];
		sumMat=sumMat+mat[i];
		avgAvg=avgAvg + (int)avg[i];
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("�����\t" + sumKor/3 + "\t" + sumEng/3 + "\t" + sumMat/3 + "\t\t" + avgAvg/3);
	}

}