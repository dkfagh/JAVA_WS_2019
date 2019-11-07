import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch3_Ex15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� �� �� �Է� ");
		
		while(true) {
			try {
				int n = s.nextInt();
				int m = s.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				break;
			} catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				s.nextLine();
				continue;
			}
		}
		s.close();
	}
}