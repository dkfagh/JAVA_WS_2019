import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
//		
//		while(st.hasMoreTokens())
//			System.out.println(st.nextToken());
		
		StringTokenizer st = new StringTokenizer("2+3+5+66+88+323","+");
		
		int sum = 0;
		while(st.hasMoreTokens())
			
			sum+=Integer.parseInt(st.nextToken());
		
		System.out.println(sum);
	}
}