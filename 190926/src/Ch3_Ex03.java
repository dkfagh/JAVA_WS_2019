import java.util.Scanner;

public class Ch3_Ex03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int x = s.nextInt();
		
		for(int i = 0 ; i < x ; i++) {
			for(int j = 0 ; j < x-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}

//import java.util.Scanner;
//
//public class PrintAsterisk {
//	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("������ �Է��Ͻÿ�>>");
//		int n = scanner.nextInt();
//		if (n <=0) {
//			System.out.println("0���� Ŀ�� �մϴ�.");
//			scanner.close();
//			return;
//		}
//		
//		for (int i=n; i>0; i--) { // n�� ���
//			for (int j=0; j<i; j++) { // i���� ��ǥ�� �� �ٿ� ���
//				System.out.print('*');
//			}
//			System.out.println(); // ���� �ٷ� �Ѿ��
//		}
//		scanner.close();
//	}
//}