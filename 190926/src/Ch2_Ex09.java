import java.util.Scanner;

public class Ch2_Ex09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		int x = s.nextInt();
		int y = s.nextInt();
		double r = s.nextDouble();
		
		System.out.print("점 입력>>");
		double a = s.nextDouble();
		double b = s.nextDouble();
		
		int i = x-(int)a;
		int j = y-(int)b;
		
		if(Math.abs(i)<=r && Math.abs(j)<=r)
			System.out.println("점 ("+a+", "+b+")는 원 안에 있다.");
		else
			System.out.println("점 ("+a+", "+b+")는 원 안에 없다.");
		
		s.close();
	}
}


//import java.util.Scanner;
//
//public class CircleInclusion {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("원의 중심과 반지름 입력>>");
//		double x = scanner.nextDouble();
//		double y = scanner.nextDouble();
//		double radius = scanner.nextDouble();
//		
//		System.out.print("점 입력>>");
//		double x2 = scanner.nextDouble();
//		double y2 = scanner.nextDouble();
//		
//		double distance = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
//		if(distance < radius)
//			System.out.print("점 (" + x2 + ", " + y2 + ")는 원 안에 있다.");
//		else
//			System.out.print("점 (" + x2 + "," + y2 + ")는 원 밖에 있다.");
//
//		scanner.close();
//	}
//
//}