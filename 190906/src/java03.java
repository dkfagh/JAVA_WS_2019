import java.util.Scanner;

class Member {
	String name, address, job;
	int age;
	
	void showInfo() {System.out.println(name+" / "+age+"�� / "+address+" / "+job);}
}

public class java03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸� �ּ� ���� ���̸� EnterŰ�� �����Ͽ� �Է��Ͻÿ�.");
		
		Member yang = new Member();
		yang.name = s.nextLine();
		yang.address = s.nextLine();
		yang.job = s.nextLine();
		yang.age = s.nextInt();
		
		yang.showInfo();
		
		s.close();
	}
}