import java.util.Scanner;

public class Java02_3 {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = scanner.nextInt();
		do {
			sum+=n;
			count++;
			n=scanner.nextInt();
		} while(n!=-1);
		
		if(count==0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		
		System.out.println("�Էµ� ���� "+count+"�� �̸� ����� "+(double)sum/count+"�Դϴ�.");
		
		scanner.close();
	}
}