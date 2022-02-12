package Inheritance;

public class multiplication extends arithmeticOperation{
	
	void mul(int a,int b) {
		z=a*b;
		System.out.println("Multiplication of 2 numbers:"+z);
	}

public static void main(String[] args) {
	
	int a=25,b=45;
	multiplication ap=new multiplication();
	ap.add(a, b);
	ap.Sub(a, b);
	ap.mul(a, b);
	}
}
