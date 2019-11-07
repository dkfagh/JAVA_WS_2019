import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		
		int sum=0;
		for(int i=0;i<5;i++) {
			int n = s.nextInt();
			if(n<=0)
				continue;
			sum+=n;
		}
		System.out.println("양수의 합은 "+sum);
		
		s.close();
	}
}