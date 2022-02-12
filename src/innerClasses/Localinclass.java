package innerClasses;

public class Localinclass {

	private int data=500;
	void show() {
	class Inner{
		void display() {
			System.out.println(+data);
		}
	}
	Inner i=new Inner();
	i.display();
	}
	public static void main(String[] args) {
		Localinclass m=new Localinclass();
		m.show();
	}

}
