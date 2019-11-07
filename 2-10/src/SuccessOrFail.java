import java.util.Scanner;
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = s.nextInt();
		if(score>=80)
			System.out.println("축하합니다! 합격입니다!");
		
		s.close();
	}
}