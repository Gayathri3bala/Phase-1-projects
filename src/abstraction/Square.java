package abstraction;

public class Square extends Shape{
	
	private int a;
	
	public Square(int a) {
		this.a=a;
	}
	
	int area() {
		return (a*a);
	}
	public String toString(){
		return ("Area is:"+area());
		
	}
	
public static void main(String[] args) {
	Shape s=new Square(15);
	System.out.println(s);
	
}

}
