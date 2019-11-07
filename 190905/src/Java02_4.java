import java.util.Scanner;

public class Java02_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		int n=scanner.nextInt();
		
		String[][] table = new String[n][4];
		
		for(int i=0;i<table.length;i++) {
			System.out.print("이름 : ");
			table[i][0]=scanner.next();
			System.out.print("국어 점수 : ");
			table[i][1]=scanner.next();
			System.out.print("영어 점수 : ");
			table[i][2]=scanner.next();
			System.out.print("수학 점수 : ");
			table[i][3]=scanner.next();
			}
		
		double korsum=0, engsum=0, mathsum=0;
		
		for(int t=0;t<table.length;t++) {
			korsum+=Double.parseDouble(table[t][1]);
			engsum+=Double.parseDouble(table[t][2]);
			mathsum+=Double.parseDouble(table[t][3]);
		}
		
		System.out.println("\n국어 평균 : "+korsum/n);
		System.out.println("영어 평균 : "+engsum/n);
		System.out.println("수학 평균 : "+mathsum/n);
		
		System.out.println("전체 평균 : "+ (korsum/n+engsum/n+mathsum/n)/3);
		
		scanner.close();
		}		
	}