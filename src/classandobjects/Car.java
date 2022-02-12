package classandobjects;

public class Car {
	String Name;
	String Model;
	String Color;
	float Mileage;
	
	public Car(String Name,String Model,String Color,float Mileage) {
		this.Name=Name;
		this.Model=Model;
		this.Color=Color;
		this.Mileage=Mileage;
	}
	public String getName() {
		return Name;
	}
	public String getModel() {
		return Model;
	}
	public String getColor() {
		return Color;
	}
	public float getMileage() {
		return Mileage;
	}
	
	@override
	public String toString() {
		return("Car Name is:"+this.getName()+"\nModel:"+this.getModel()+"\nColor of Car:"+this.getColor()+"\nMileage (kmpl):"+this.getMileage());
		}
	
	public static void main(String[] args) {
		Car car=new Car("Maruti Suzuki","Swift","Black",23.76f);
		System.out.println(car.toString());
	}
	
}
