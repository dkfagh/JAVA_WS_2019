import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("수를 입력하세요 : ");
		int number = s.nextInt();
		
		if(number%3==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		s.close();
	}
}