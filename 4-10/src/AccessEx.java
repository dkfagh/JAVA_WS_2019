class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;  //Sample Ŭ������ private ����μ� ������ ������ �߻��Ѵ�.
		sample.c = 10;
	}
}