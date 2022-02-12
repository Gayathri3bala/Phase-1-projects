package multithreadingExceptionhandlingandOOPS;

public class ThreadDemo {
	
	public void start() {
		System.out.println("Thread Started");
	}
	
	public static void main(String[] args) {
		ThreadDemo thread=new ThreadDemo();
		thread.start();
	}

}
