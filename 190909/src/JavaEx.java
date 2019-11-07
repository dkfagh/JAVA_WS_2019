abstract class Mouse {
	abstract public void mouseMove();
	public void leftClick() {
		System.out.println("left");
	}
	public void rightClick() {
		System.out.println("right");
	}
}

class WheelMouse extends Mouse {
	public void mouseMove() {
		System.out.println("mouseMove");
	}
	public void leftClick() {
		System.out.println("left");
	}
	public void rightClick() {
		System.out.println("right");
	}
	public void upWheel() {
		System.out.println("page up");
	}
	public void downWheel() {
		System.out.println("page down");
	}
}

class LaserMouse extends WheelMouse {
	public void mouseMove() {
		System.out.println("mouseMove");
	}
	public void leftClick() {
		System.out.println("left");
	}
	public void rightClick() {
		System.out.println("right");
	}
	public void laserPoint() {
		System.out.println("laser point");
	}
}

public class JavaEx {
	public static void main(String[] args) {
		WheelMouse w = new WheelMouse();
		w.mouseMove();
		w.leftClick();
		w.rightClick();
		w.upWheel();
		w.downWheel();
		LaserMouse l = new LaserMouse();
		l.mouseMove();
		l.leftClick();
		l.rightClick();
		l.laserPoint();
	}
}