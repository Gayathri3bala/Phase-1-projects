package innerClasses;

public class MemberInClass {
	private int data=19;
	class Inner{
		void display() {
			System.out.println(+data);
		}
	}
	public static void main(String[] args) {
		MemberInClass b=new MemberInClass();
		MemberInClass.Inner in=b.new Inner();
		in.display();
	}

}
