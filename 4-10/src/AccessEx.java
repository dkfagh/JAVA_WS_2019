class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;  //Sample 클래스의 private 멤버로서 컴파일 오류가 발생한다.
		sample.c = 10;
	}
}