import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner s =new Scanner(System.in);
		
		String name = s.next();
		System.out.print("이름은 "+name+", ");
		
		String city = s.next();
		System.out.print("도시는 "+city+", ");
		
		int age = s.nextInt();
		System.out.print("나이는 "+age+", ");
		
		double weight = s.nextDouble();
		System.out.print("체중은 "+weight+", ");
		
		boolean isSingle = s.nextBoolean();
		System.out.println("독신 여부는 "+isSingle+"입니다.");
		
		s.close();
	}
}