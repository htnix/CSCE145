
public class Apple {

	private String appleType;
	private double appleWeight;
	private double applePrice;
	
	public Apple() {
		this.appleType = "Gala";
		this.appleWeight = 0.5;
		this.applePrice = 0.88;
	}
	
	public Apple(String xAppleType, double xAppleWeight, double xApplePrice) {
		
		this.setAppleType(xAppleType);
		this.setAppleWeight(xAppleWeight);
		this.setApplePrice(xApplePrice);
	}
	
	public String getAppleType() {
		return this.appleType;
	}
	
	public double getAppleWeight() {
		return this.appleWeight;
	}
	
	public double getApplePrice() {
		return this.applePrice;
	}
	
	public void setAppleType(String xAppleType) {
		if(xAppleType.equalsIgnoreCase("Red Delicious") || xAppleType.equalsIgnoreCase("Golden Delicious") || xAppleType.equalsIgnoreCase("Gala") || xAppleType.equalsIgnoreCase("Granny Smith")) {
			this.appleType = xAppleType;
		}else {
			System.out.println("This is not a vaild type!");
		}
	}
	
	public void setAppleWeight(double xAppleWeight) {
		if(xAppleWeight > 0 && xAppleWeight < 2) {
			this.appleWeight = xAppleWeight;
		}else {
			System.out.println("This is not a vaild weight!");
		}
	}
	
	public void setApplePrice(double xApplePrice) {
		if(xApplePrice > 0) {
			this.applePrice = xApplePrice;
		}else {
			System.out.println("This is not a vaild Price");
		}
	}
	
	public String writeOutput() {
		return "Type: " + this.appleType + "\nWeight: " + this.appleWeight + "\nPrice: " + this.applePrice;
	}
}
