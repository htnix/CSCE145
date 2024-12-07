//Hayes Nix
public class Ship {

	
	private String shipName;
	private String shipDate;
	
	public Ship() {
		this.shipName = "no name entered";
		this.shipDate = "mm/dd/yyyy";
	}
	
	public Ship(String xShipName, String xShipDate) {
		this.setShipName(xShipName);
		this.setShipDate(xShipDate);
	}
	
	public String getShipName() {
		return this.shipName;
	}
	
	public String getShipDate() {
		return this.shipDate;
	}
	
	public void setShipName(String xShipName) {
		this.shipName = xShipName;
	}
	
	public void setShipDate(String xShipDate) {
		int year = Integer.parseInt(xShipDate.substring(6,10));
		if(year >= 1990 && year <= 2019) {
			this.shipDate = xShipDate;
		}else {
			System.out.println("This is not a vaild year");
		}
	}
	
	public String toString() {
		return "Name: " + this.shipName + "\nLaunch Date: " + this.shipDate;
	}
}
