class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
//		c�� ���۷��������̰� ũ�Ⱑ 5�� �迭�� ����Ų��.
//		�迭�� ���� Circle���̴�.
//		=>Circle instance�� ����Ű�� �������̴�.
		Circle [] c = new Circle[5];

		for(int i=0;i<c.length;i++) {
			c[i] = new Circle(i);
		
//		for(int i=0;i<c.length;i++)
			System.out.print((int)(c[i].getArea()) + " ");
		}
//		c[0] = new Circle(100);
//		c[1] = new Circle(200);
//		c[2] = new Circle(300);
//		c[3] = new Circle(400);
//		c[4] = new Circle(500);
//		
//		System.out.print(c[0].radius+" ");
//		System.out.print(c[1].radius+" ");
//		System.out.print(c[2].radius+" ");
//		System.out.print(c[3].radius+" ");
//		System.out.println(c[4].radius);
//		
//		System.out.print((int)c[0].getArea()+" ");
//		System.out.print((int)c[1].getArea()+" ");
//		System.out.print((int)c[2].getArea()+" ");
//		System.out.print((int)c[3].getArea()+" ");
//		System.out.println((int)c[4].getArea());
		}
	}