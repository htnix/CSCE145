
public class Coffee {

	public String coffeeName;
	public double caffContent;
	
	
	public Coffee(){
		this.coffeeName = "";
		this.caffContent = 0;
	}
	
	public Coffee(String xCoffeeName, double xCaffContent) {
		this.setCoffeeName(xCoffeeName);
		this.setCaffContent(xCaffContent);
	}
	
	public String getCoffeeName() {
		return this.coffeeName;
	}
	
	public double getCaffContent() {
		return this.caffContent;
	}
	
	public void setCoffeeName(String xCoffeeName) {
		this.coffeeName = xCoffeeName;
	}
	
	public void setCaffContent(double xCaffContent) {
		if (xCaffContent > 0) {
			this.caffContent = xCaffContent;
		}else {
			System.out.println("Invaid amount please enter a vaild number");
		}
	}
	
	public String toString() {
		return "Coffee Name: " + this.coffeeName + "\nCaffeine amount: " + this.caffContent + "mg";
	}
	
	public double cupsAmount() {
		return Math.round(180 / ((this.caffContent / 100) * 6.0) * 10);
	}
}
