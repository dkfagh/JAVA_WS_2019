public class Ch3_Ex09 {
	public static void main(String[] args) {
		int [][] a = new int[4][4];
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a.length ; j++) {
				a[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a.length ; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}