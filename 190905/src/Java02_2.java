import java.util.Scanner;

public class Java02_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		double kor = scanner.nextInt();
		
		System.out.print("영어 점수 : ");
		double eng = scanner.nextInt();
		
		System.out.print("수학 점수 : ");
		double math = scanner.nextInt();
		
		System.out.print("\n"+"평균 점수는 "+(kor+eng+math)/3+"점 입니다.");
		
		scanner.close();
	}
}