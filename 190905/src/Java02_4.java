import java.util.Scanner;

public class Java02_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		int n=scanner.nextInt();
		
		String[][] table = new String[n][4];
		
		for(int i=0;i<table.length;i++) {
			System.out.print("�̸� : ");
			table[i][0]=scanner.next();
			System.out.print("���� ���� : ");
			table[i][1]=scanner.next();
			System.out.print("���� ���� : ");
			table[i][2]=scanner.next();
			System.out.print("���� ���� : ");
			table[i][3]=scanner.next();
			}
		
		double korsum=0, engsum=0, mathsum=0;
		
		for(int t=0;t<table.length;t++) {
			korsum+=Double.parseDouble(table[t][1]);
			engsum+=Double.parseDouble(table[t][2]);
			mathsum+=Double.parseDouble(table[t][3]);
		}
		
		System.out.println("\n���� ��� : "+korsum/n);
		System.out.println("���� ��� : "+engsum/n);
		System.out.println("���� ��� : "+mathsum/n);
		
		System.out.println("��ü ��� : "+ (korsum/n+engsum/n+mathsum/n)/3);
		
		scanner.close();
		}		
	}