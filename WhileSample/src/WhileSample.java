import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = s.nextInt();
		while(n!=-1) {
			sum+=n;
			count++;
			n=s.nextInt();
		}
		if(count==0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		
		System.out.println("�Էµ� ���� "+count+"�� �̸� ����� "+(double)sum/count+"�Դϴ�.");
		
		s.close();
	}
}