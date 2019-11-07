public class Ch3_Ex07 {
	public static void main(String[] args) {
		int [] a = new int[10];
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int t = 0 ; t < a.length ; t++) {
			int i = (int)(Math.random()*10+1);
			a[t] = i;
			System.out.print(i+" ");
		}
		
		int sum = 0;
		
		for(int t = 0 ; t < a.length ; t++)
			sum+=a[t];
		
		double avg=sum/a.length;
		
		System.out.println("\nÆò±ÕÀº "+avg);
	}
}