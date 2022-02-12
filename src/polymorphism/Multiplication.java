package polymorphism;

 class  Multiplication {
	public int Multiply(int a, int b) {
		return (a*b);
	}
	public int Multiply(int a, int b,int c) {
		return (a*b*c);
	}
	public double Multiply(double a,double b) {
		return (a*b);
	}
	public float Multiply(float a,float b) {
		return (a*b);
	}
	
	public static void main(String[] args) {
		Multiplication mul=new Multiplication();
		System.out.println(mul.Multiply(15 , 30));
		System.out.println(mul.Multiply(8,5,40));
		System.out.println(mul.Multiply(3.14,7.25));
		System.out.println(mul.Multiply(5.01f,20.3f));
	}
	

}
