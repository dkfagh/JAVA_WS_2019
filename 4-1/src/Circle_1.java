class Circles {
	int radius;
	String name;
	public Circles() {};
	public double getArea() {
		return 3.14*radius*radius;
	}
}


public class Circle_1 {
	public static void main(String[] args) {
		//인스턴스 생성
		Circles pizza = new Circles();
		pizza.radius = 50;
		pizza.name = "TIS피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circles donut = new Circles();
		donut.radius = 20;
		donut.name = "TIS도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}