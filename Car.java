public class Car {
    private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	
	public Car() {
		color = "Black";
		horsePower = 250;
		engineSize = 4.0;
		make = "Toyata";
	}
	
	public Car(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setHorsePower(int newHorsePower) {
		this.horsePower = newHorsePower;
	}
	
	public int getHorsePower() {
		return this.horsePower;
	}
	
	public void setEngineSize(double newEngineSize) {
		this.engineSize = newEngineSize;
	}
	
	public double getEngineSize() {
		return this.engineSize;
	}
	
	public void setMake (String newMake) {
		this.make = newMake;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String toString() {
		return "Color: " + this.color + 
			   ", Horse Power: " + this.horsePower + 
			   ", Engine Size: " + this.engineSize +
			   ", Make: " + this.make;
	}

}
	