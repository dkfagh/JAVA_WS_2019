import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� : ");
		int number = s.nextInt();
		
		if(number%3==0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		
		s.close();
	}
}