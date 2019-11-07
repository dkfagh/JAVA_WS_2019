public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for (int i = 0 ; i<s.length ; i++)
			System.out.println("분리된 문자열" + (i+1) + " : " + s[i]);
		
		a = a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
		
		String fileName = "list.hwp";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.substring(fileName.indexOf(".")+1));
		
		String fileNames = "2019.09.10.list.html";
		System.out.println(fileNames.indexOf("."));
		System.out.println(fileNames.lastIndexOf("."));
		System.out.println(fileNames.substring(fileNames.lastIndexOf(".")+1));
	}
}