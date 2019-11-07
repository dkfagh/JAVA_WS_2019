import java.util.Scanner;

class Member {
	String name, address, job;
	int age;
	
	void showInfo() {System.out.println(name+" / "+age+"세 / "+address+" / "+job);}
}

public class java03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름 주소 직업 나이를 Enter키로 구분하여 입력하시오.");
		
		Member yang = new Member();
		yang.name = s.nextLine();
		yang.address = s.nextLine();
		yang.job = s.nextLine();
		yang.age = s.nextInt();
		
		yang.showInfo();
		
		s.close();
	}
}