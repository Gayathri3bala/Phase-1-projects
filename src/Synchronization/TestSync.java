package Synchronization;

public class TestSync {
	public static void main(String[] args) {
		Sender sender=new Sender();
		
		User t1=new User("Gayu","Hi",sender);
		
		User t2=new User("Raji","Hello",sender);
		
		t1.start();
		t2.start();
	}

}
