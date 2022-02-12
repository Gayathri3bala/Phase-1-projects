package diamondproblem;

public class Demo implements MyInterface1, MyInterface2 {
	public void display() {
		MyInterface1.super.display();
		MyInterface2.super.display();
	}

	public static void main(String args[]) {
		Demo obj = new Demo();
		obj.display();
	}
}
