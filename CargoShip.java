
public class CargoShip extends Ship{

	private int tonnage;
	private int maxSpeed;
	
	public CargoShip() {
		super();
		this.tonnage = 0;
		this.maxSpeed = 0;
	}
	
	public CargoShip(String xShipName, String xShipDate, int xTonnage, int xMaxSpeed) {
		super(xShipName, xShipDate); // calls the variables from the parent class
		this.getTonnage(xTonnage);
		this.getMaxSpeed(xMaxSpeed);
	}
	
	public int setTonnage() {
		return this.tonnage;
	}
	
	public int setMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void getTonnage(int xTonnage) {
		if(xTonnage > 0) {
			this.tonnage = xTonnage;
		}else {
			System.out.print("This is not a vaild tonnage amount");
		}
	}
	
	public void getMaxSpeed(int xMaxSpeed) {
		if(xMaxSpeed > 0) {
			this.maxSpeed = xMaxSpeed;
		}else {
			System.out.print("This is not a vaild max speed");
		}
	}
	
	public String toString() {
		return "Name: " + getShipName() + "\nTonnage " + this.tonnage + " DWT" + "\nMax Speed: " + this.maxSpeed;
	}
}
