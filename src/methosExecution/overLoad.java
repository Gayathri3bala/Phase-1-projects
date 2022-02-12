package methosExecution;


public class overLoad {
	public void area(int a)
    {
         System.out.println("Area of Square: "+(a*a));
    }
    public void area(int l,int b) 
    {
         System.out.println("Area of Rectangle : "+(l*b));
    }

    public static void main(String args[])
   {
    	overLoad z=new overLoad();
       z.area(52);
       z.area(5,12);  
   }

}
