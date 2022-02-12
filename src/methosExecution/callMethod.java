package methosExecution;

public class callMethod {
	int c=150;

	void operation(int c) {
		this.c=c*10/100;
		}

	public static void main(String args[]) {
		callMethod d = new callMethod();
		System.out.println("Before operation value of data is "+d.c);
		d.operation(100);
		System.out.println("After operation value of data is "+d.c);
		}
	}


