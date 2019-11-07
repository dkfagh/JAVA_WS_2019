import java.util.Scanner;

public class JavaEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		
		String a = new String("!,@,#,$,%,^");
		String x[] = a.split(",");
		
		do {
			
		count = 0;
		
		System.out.print("사용하실 ID를 입력하세요 : ");
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
		System.out.println("ID에 '!,@,#,$,%,^'가 포함되면 안됩니다.");
		}
		} while (count!=0); 
		
		System.out.println("사용할 수 있는 ID입니다.");
		
		s.close();
		}
	}