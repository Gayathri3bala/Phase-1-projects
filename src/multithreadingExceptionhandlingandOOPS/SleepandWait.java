package multithreadingExceptionhandlingandOOPS;

public class SleepandWait {
	public static Object B=new Object();
	
	public static void main(String[] args) {
		
		try {
			
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is woke up after"
					+ " 1 second of sleep");
			
			synchronized (B) {
				B.wait(2000);
				System.out.println("Object is woke up after wait of 2 seconds");
			}
		} catch (InterruptedException e) {
			System.out.println("Error occured "+e);
		}
		
	}

}
