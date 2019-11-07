class TV {	
	private String p;
	private int y, i;
	
	public TV(String p, int y, int i) {
		this.p = p;
		this.y = y;
		this.i = i;
	}
	
	public void show() {
		System.out.println(p+"에서 만든 "+y+"년형 "+i+"인치 TV");
	}
}

public class Ch4_Ex01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}