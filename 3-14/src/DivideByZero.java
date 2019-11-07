import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("분자를 입력하세요 : ");
		dividend = scanner.nextInt();
		System.out.print("분모를 입력하세요 : ");
		divisor = scanner.nextInt();
		
		try {
			System.out.println(dividend+"를 "+divisor+"로 나눈 몫은 "+dividend/divisor+"입니다.");
		} catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		scanner.close();
	}
}
