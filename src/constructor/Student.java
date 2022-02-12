package constructor;

public class Student {
	int Rno;
	String fname;
	String lname;
	int Std;
	float per;
	
	Student(){
		//Default Constructor
		System.out.println("Default Constructor\n");
	}
	
	Student(String fname,String lname,int Std){
		//Parameterized Constructor
		
		this.fname=fname;
		this.lname=lname;
		this.Std=Std;
	}
	
	Student(int Rno,String fname,String lname,int Std, float per){
		//Constructor Overloading
		
		this.Rno=Rno;
		this.fname=fname;
		this.lname=lname;
		this.Std=Std;
		this.per=per;
	}
	
	public void display() {
		System.out.println("Rollno:"+Rno);
		System.out.println("First name:"+fname);
		System.out.println("Last name:"+lname);
		System.out.println("Standard:"+Std);
		System.out.println("Percentage:"+per);
		System.out.println("\n");
		
	}
	
	public static void main(String args[]) {
		Student s=new Student();
		Student s1=new Student("Aadhadvan","K",8);
		Student s2=new Student(12,"Kishore","Krish",10,92.5f);
		s.display();
		s1.display();
		s2.display();
		
		
	}
	
	

}
