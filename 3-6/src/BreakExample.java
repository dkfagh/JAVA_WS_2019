import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String text = s.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�....");
		
		s.close();
	}
}