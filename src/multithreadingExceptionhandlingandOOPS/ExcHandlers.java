package multithreadingExceptionhandlingandOOPS;

public class ExcHandlers {
	static void call()
	{
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		call();
	}
}

