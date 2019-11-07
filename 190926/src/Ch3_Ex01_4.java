public class Ch3_Ex01_4 {
	public static void main(String[] args) {

		int sum=0, i=0;
		do {
			sum+=i;
			i+=2;
		}
		while(i<100);
		
		System.out.println(sum);
	}
}


//public class DoWhileTest {
//	public static void main(String[] args) {
//		int sum=0, i=0;
//		do {
//			if(i >= 99) 
//				break;
//			sum = sum + i;
//			i += 2;
//		} while (true);
//		System.out.println(sum);
//	}
//}