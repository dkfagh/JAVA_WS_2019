public class MyClass<T> {
	T val;
	void set (T a) {
		this.val = a;
	}
	T get() {
		return this.val;
	}

	public static void main(String[] args) {
		MyClass<Integer> mc =new MyClass<Integer>();
		mc.set(10);
		System.out.println(mc.get());
		
		MyClass<String> mc2 = new MyClass<String>();
		mc2.set("ÀÚ¹Ù");
		System.out.println(mc2.get());		
	}
}