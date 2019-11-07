import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요(0~100) : ");
		
		int score=s.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println(grade+"학점 입니다.");
		
		s.close();
		}
	}