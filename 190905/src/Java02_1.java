import java.util.Scanner;

public class Java02_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name=scanner.next();
		
		System.out.print("�й��� �Է��ϼ��� : ");
		String num=scanner.next();
		
		System.out.print("�а��� �Է��ϼ��� : ");
		String major=scanner.next();
		
		System.out.println("\n"+name+" / "+num+" / "+major);
		
		scanner.close();
	}
}