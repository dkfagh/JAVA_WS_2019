import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100) : ");
		int score = s.nextInt();
		System.out.println("�г��� �Է��ϼ���(1~4) : ");
		int year = s.nextInt();
		
		if(score>=60) {
			if(year!=4)
				System.out.println("�հ�!!!");
			else if(score>=70)
				System.out.println("�հ�!!!");
			else
				System.out.println("���հ�!!!");
			}
		else
			System.out.println("���հ�!!!");
		
		s.close();
		}
	}