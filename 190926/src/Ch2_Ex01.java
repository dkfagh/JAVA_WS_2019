import java.util.Scanner;

public class Ch2_Ex01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 : 원)>>");		
		
		int won = s.nextInt();
		double dollar = won/1100;
		
		System.out.println(won+"원은 $"+dollar+"입니다.");
		
		s.close();
	}
}