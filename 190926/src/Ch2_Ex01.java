import java.util.Scanner;

public class Ch2_Ex01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� : ��)>>");		
		
		int won = s.nextInt();
		double dollar = won/1100;
		
		System.out.println(won+"���� $"+dollar+"�Դϴ�.");
		
		s.close();
	}
}