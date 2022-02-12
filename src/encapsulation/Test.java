package encapsulation;

public class Test {  
public static void main(String[] args) {  
	
	Account acc=new Account();  
    acc.setAno(1234567890L);  
    acc.setName("Gayathri B");  
    acc.setEmail("gayathri132@mail.com");  
    acc.setAmount(500000f);  
    System.out.println("Account Number:"+acc.getAno()+"\nAccount Holder Name:"+acc.getName()+"\nEmail ID: "+acc.getEmail()+"\nAmount: "+acc.getAmount());  
}  
}  

