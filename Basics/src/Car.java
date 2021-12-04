/**
 * 
 */

/**
 * @author anupb
 *
 */
public class Car implements Vehicle{
	
	private int tyres;
	private String engine;
	
	//default
	//private
	//protected
	//public

	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		
		Vehicle car1 = new Car();
		car1.drive();
	}

	public Car() {
		
	}
	public Car(int tyres, String engine) {
		super();
		this.tyres = tyres;
		this.engine = engine;
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void drive(){
		System.out.println("I am driving car");
	}

}
