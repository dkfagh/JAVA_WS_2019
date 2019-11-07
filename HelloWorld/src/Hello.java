public class Hello {

	public static int sum(int n, int m) {
		return n+m;
	}

	public int minus(int n, int m) {
		return n-m;
	}
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;

		s=sum(i,10);
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println("µ¡¼À °á°ú : "+s);

		Hello h=new Hello(); // h´Â instance. ½ÇÇà¸Þ¸ð¸®¿¡ ¿Ã¶ó°¨
		int result=h.minus(10, 20);
		System.out.println("»¬¼À °á°ú : "+result);
	}
}