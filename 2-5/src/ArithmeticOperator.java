import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int time=s.nextInt();
		
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"�ʴ� "+hour+"�ð� "+minute+"�� "+second+"�� �Դϴ�.");

		s.close();
	}	
}