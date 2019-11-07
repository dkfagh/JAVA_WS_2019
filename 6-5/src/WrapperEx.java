public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		
		char c1='4', c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"는 영문자");
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
		
		String x = "Hello";
		String y = "Hello";
		System.out.println(x);
		System.out.println(y);
		System.out.println(Integer.toHexString(System.identityHashCode(x)));
		System.out.println(Integer.toHexString(System.identityHashCode(y)));
		y = "java";
		System.out.println(x);
		System.out.println(y);
		System.out.println(Integer.toHexString(System.identityHashCode(x)));
		System.out.println(Integer.toHexString(System.identityHashCode(y)));
		
		String m = new String("Hello");
		String n = new String("Hello");
		System.out.println(Integer.toHexString(System.identityHashCode(m)));
		System.out.println(Integer.toHexString(System.identityHashCode(n)));
		
		String s = new String("Hello");
		System.out.println(s.concat(" world"));
		System.out.println(s);
	}
}