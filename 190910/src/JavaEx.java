import java.util.Scanner;

public class JavaEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		
		String a = new String("!,@,#,$,%,^");
		String x[] = a.split(",");
		
		do {
			
		count = 0;
		
		System.out.print("����Ͻ� ID�� �Է��ϼ��� : ");
		String id = s.next();		
			
		String y[] = new String[id.length()];
		for(int i = 0 ; i < id.length() ; i++) {
			y[i] = String.valueOf(id.charAt(i));
		}
		
		for(int i = 0 ; i < id.length() ; i++)
			for(int j = 0 ; j < x.length ; j++)
				if(y[i].equals(x[j])) {
					count++;
				}		
		if(count!=0) {
		System.out.println("ID�� '!,@,#,$,%,^'�� ���ԵǸ� �ȵ˴ϴ�.");
		}
		} while (count!=0); 
		
		System.out.println("����� �� �ִ� ID�Դϴ�.");
		
		s.close();
		}
	}