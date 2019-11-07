import java.io.*;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fout = new FileWriter("C:\\temp\\test.txt");
			while(true) {
				String line = s.nextLine();
				if(line.length() == 0) 
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("����� ����");
		}
		s.close();
		
//		try {
//			fin = new FileInputStream("c:\\temp\\\\test.txt");
//			in = new InputStreamReader(fin, "MS949");
//			int c;
//			
//			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
//			while((c=in.read()) != -1) {
//				System.out.print((char)c);
//			}
//			in.close();
//			fin.close();
//		} catch(IOException e) {
//			System.out.println("����� ����");
//			}
	}
}