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
		//�ν��Ͻ� ����
		Circles pizza = new Circles();
		pizza.radius = 50;
		pizza.name = "TIS����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circles donut = new Circles();
		donut.radius = 20;
		donut.name = "TIS����";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}
}