import java.util.Scanner;

public class Java02_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		double kor = scanner.nextInt();
		
		System.out.print("���� ���� : ");
		double eng = scanner.nextInt();
		
		System.out.print("���� ���� : ");
		double math = scanner.nextInt();
		
		System.out.print("\n"+"��� ������ "+(kor+eng+math)/3+"�� �Դϴ�.");
		
		scanner.close();
	}
}