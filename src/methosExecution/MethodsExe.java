package methosExecution;

public class MethodsExe {
	public int addnumbers(int a,int b) {
		int z=a+b;
		return z;
	}

	public static void main(String[] args) {

		MethodsExe b=new MethodsExe();
		int a= b.addnumbers(10,3);
		System.out.println("Multipilcation is :"+a);
		}

}
