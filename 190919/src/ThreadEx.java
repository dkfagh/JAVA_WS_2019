class ThreadA extends Thread {
	public void run() {
		for (int i = 0 ; i < 50 ; i++) {
			System.out.println(this.getName());
			try {
				//Thread.sleep(30);
			}
			catch(Exception e) {}
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		for (int i = 0 ; i < 50 ; i++) {
			System.out.println(this.getName());
			try {
				//Thread.sleep(30);
			}
			catch(Exception e) {}
		}
	}
}

class ThreadC implements Runnable {

	@Override
	public void run() {
		for (int i = 0 ; i < 50 ; i++) {
			System.out.println("Thread C");
			try {
				//Thread.sleep(30);
			}
			catch(Exception e) {}
		}
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);
	}
}

public class ThreadEx {
	
	public static void main(String[] args) {
		
		ThreadA thA = new ThreadA();
		thA.setName("스레드 A");
		ThreadB thB = new ThreadB();
		thB.setName("스레드 B");
		thA.setPriority(10);
		thB.setPriority(1);
		thA.start();
		thB.start();
		
		ThreadC thC = new ThreadC();
		Thread t = new Thread(thC);
		t.start();
		
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println("Main Thread");
			try {
				//Thread.sleep(30);
			}
			catch(Exception e) {}
		}
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);
		
	}
}