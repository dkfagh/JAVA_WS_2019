import java.util.Scanner;

public class Ch2_Ex11_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int m = s.nextInt();
		
		if(m>2 && m<6)
			System.out.println("��");
		else if(m>5 && m<9)
			System.out.println("����");
		else if(m>8 && m<12)
			System.out.println("����");
		else if(m==12 || m==1 || m==2)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸� �Է�");
		s.close();
	}
}