import java.util.Scanner;

public class Ch3_Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		
		for(int i = 0 ; i < a.length ; i++)
			a[i] = s.nextInt();
		
		System.out.print("3�� ����� ");
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]%3==0) {
				System.out.print(a[i]+" ");
			}
		}
		s.close();
	}
}