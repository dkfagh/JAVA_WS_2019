import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner s =new Scanner(System.in);
		
		String name = s.next();
		System.out.print("�̸��� "+name+", ");
		
		String city = s.next();
		System.out.print("���ô� "+city+", ");
		
		int age = s.nextInt();
		System.out.print("���̴� "+age+", ");
		
		double weight = s.nextDouble();
		System.out.print("ü���� "+weight+", ");
		
		boolean isSingle = s.nextBoolean();
		System.out.println("���� ���δ� "+isSingle+"�Դϴ�.");
		
		s.close();
	}
}