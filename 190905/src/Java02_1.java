import java.util.Scanner;

public class Java02_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name=scanner.next();
		
		System.out.print("학번을 입력하세요 : ");
		String num=scanner.next();
		
		System.out.print("학과를 입력하세요 : ");
		String major=scanner.next();
		
		System.out.println("\n"+name+" / "+num+" / "+major);
		
		scanner.close();
	}
}