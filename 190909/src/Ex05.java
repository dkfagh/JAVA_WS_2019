class Person {
	public void speak() {
		System.out.println("speak");
	}
	public void eat() {
		System.out.println("eat");
	}
	public void eat(String food) {
		System.out.println("eat "+food);
	}
	public void walk() {
		System.out.println("walk");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
class Student extends Person {
	public void study() {
		System.out.println("study");
	}
}
class Studentworker extends Student {
	public void work() {
		System.out.println("work");
	}
	public void sleep() {
		System.out.println("deep sleep");
	}
}
class Researcher extends Person {
	public void research() {
		System.out.println("research");
	}
}
class Professor extends Researcher {
	public void teach() {
		System.out.println("teach");
	}
}

class Point {
	private int x;
	private int y;
//	@Override
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
		p.eat("¶ó¸é");
		Student s = new Student();
		s.speak();
		s.sleep();
		s.study();
		Studentworker w = new Studentworker();
		w.work();
		w.eat("»§");
		w.sleep();
		Researcher r = new Researcher();
		r.research();
		r.eat();
		r.speak();
		Professor f = new Professor();
		f.teach();
		f.walk();
		
		Point t = new Point();
		t.setX(10);
		System.out.println(t.getX());
		t.setY(20);
	}
}