
public class CruiseShip extends Ship{ // this gets the data from the parent

	private int passCap;
	private int crewNum;
	
	public CruiseShip() {
		super(); //pulls in the variables from ship
		this.passCap = 0;
		this.crewNum = 0;
	}
	
	public CruiseShip(String xShipName, String xShipDate, int xPassCap, int xCrewNum) {
		super(xShipName, xShipDate);
		this.getPassCapp(xPassCap);
		this.getCrewNum(xCrewNum);
	}
	
	public int setPassCap() {
		return this.passCap;
	}
	
	public int setCrewNum() {
		return this.crewNum;
	}
	
	public void getPassCapp(int xPassCap) {
		if(xPassCap > 0) {
			this.passCap = xPassCap;
		}else {
			System.out.println("This is not a vaild capcity");
		}
	}
	
	public void getCrewNum(int xCrewNum) {
		if(xCrewNum > 0) {
			this.crewNum = xCrewNum;
		}else {
			System.out.println("This is not a vaild crew number");
		}
	}
	
	public String toString() {
		return "Name: " + getShipName() + "\nPassenger Capacity: " + this.passCap + "\nCrew Number: " + this.crewNum;
	}
}
