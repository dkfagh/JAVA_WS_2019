import java.io.*;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\temp\\Koala.jpg");
		
		File dest = new File("c:\\temp\\copyimg2.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte [1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}