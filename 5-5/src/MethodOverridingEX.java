abstract class Shape {
	public Shape next;
	public Shape() { next = null; }
	
	public abstract void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape { 
	public void draw() {
		System.out.println("Circle");
	}
}


//public class MethodOverridingEX {
//	static void paint(Shape p) {
//	p.draw();
//	}
//	public static void main(String[] args) {
//	Line line = new Line();
//	
//	paint(line);
//	paint(new Shape());
//	paint(new Line());
//	paint(new Rect());
//	paint(new Circle());
//	
//		}
//}


public class MethodOverridingEX {
	public static void main(String[] args) {
		Shape start, last, obj;
		
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		
		Shape p = start;
		while(p!=null) {
			p.draw();
			p = p.next;
		}
	}
}