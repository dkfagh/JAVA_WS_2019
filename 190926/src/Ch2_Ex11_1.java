import java.util.Scanner;

public class Ch2_Ex11_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int m = s.nextInt();
		
		if(m>2 && m<6)
			System.out.println("봄");
		else if(m>5 && m<9)
			System.out.println("여름");
		else if(m>8 && m<12)
			System.out.println("가을");
		else if(m==12 || m==1 || m==2)
			System.out.println("겨울");
		else
			System.out.println("잘못 입력");
		s.close();
	}
}