//public class Ch3_Ex13 {
//	public static void main(String[] args) {
//		for(int i = 1 ; i < 100 ; i++) {
//			if(i%10==3 || i%10==6 || i%10==9 || i/10==3 || i/10==6 || i/10==9) {
//				System.out.println(i+" �ڼ� ¦");
//			}
//		}
//	}
//}

public class Ch3_Ex13 {
	public static void main (String args[])  {
		String str[] = {" �ڼ� ¦", " �ڼ� ¦¦"};
		int res, num, numberOf369 = 0;

		for (int i=1; i<100; i++) {
			num = i;
			for (res = num % 10; num > 0; res = num % 10) {
				if (res == 3 || res == 6 || res == 9) numberOf369++; // ������ 3,6,9�� �ϳ��� �ִ� ���  numberOf369 ����
				num = num / 10;
			}
			if (numberOf369 >0) // ���� 3,6,9�� �ϳ� �̻� �ִ� ���
				System.out.println(i + str[numberOf369-1]); 
			numberOf369 = 0;
		}
	}
}
