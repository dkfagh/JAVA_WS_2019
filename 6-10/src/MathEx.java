public class MathEx {
	public static void main(String[] args) {
//		System.out.println(Math.PI);
//		System.out.println(Math.ceil(3.14));
//		System.out.println(Math.floor(3.14));
//		System.out.println(Math.sqrt(9));
//		System.out.println(Math.exp(2));
//		System.out.println(Math.round(3.14));
		
		System.out.println("이번주 행운의 번호는");
//		for(int i = 0 ; i < 5 ; i++)
//			System.out.print((int)(Math.random()*45+1)+" ");
		
		int[] num = new int[6];
		boolean flag = true;
		while(true) {
			for(int i=0;i<6;i++) {
				num[i] = (int)(Math.random()*45+1);
			}
			for(int j=0;j<6;j++) {
				for(int k=0;k<6;k++) {
					if(j==k) {
						continue;
					}
					if(num[j]==num[k]) {
						flag=false;
					}
				}
			}
			if(flag) {
				break;
			}
		}
		for(int i=0;i<6;i++) {
		System.out.println(num[i]);
	}
}
}