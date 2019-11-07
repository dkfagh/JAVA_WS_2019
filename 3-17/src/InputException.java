import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요.");
		int n=0, sum=0;
		for(int i=0;i<3;i++) {
			System.out.print(i+1+">>");
			try {
				n= s.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				s.nextLine();
				i--;
				continue;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			sum+=n;
		}
		System.out.println("세 수의 합은 "+sum);
		s.close();
	}
}