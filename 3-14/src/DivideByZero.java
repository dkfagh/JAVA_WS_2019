import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		dividend = scanner.nextInt();
		System.out.print("�и� �Է��ϼ��� : ");
		divisor = scanner.nextInt();
		
		try {
			System.out.println(dividend+"�� "+divisor+"�� ���� ���� "+dividend/divisor+"�Դϴ�.");
		} catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		scanner.close();
	}
}
