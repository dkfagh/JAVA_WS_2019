import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int intArray[]=new int[5];
		int max=0;
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=scanner.nextInt();
			if(intArray[i]>max)
				max=intArray[i];
		}
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		
		scanner.close();
		}
	
		
//		int[] a = {10,20,30,40};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		for(int v : a) {                     // for-each��
//			System.out.println(v);
//		}
	}