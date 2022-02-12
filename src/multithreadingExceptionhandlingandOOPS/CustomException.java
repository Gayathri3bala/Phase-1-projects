package multithreadingExceptionhandlingandOOPS;

public class CustomException {

	private static int c;

	static void check() throws ArithmeticException {
		int a=5,b=0,c=a/b;
		if(c==0) {
			throw new ArithmeticException();
		}
	}

	public static void main(String args[]) {
		
		try {
			check();
		}
		catch (ArithmeticException e) {
			System.out.println("Error:"+e.getMessage());
		}
		finally {
			System.out.println("Output:"+c);
		}
	}
}
