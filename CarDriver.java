
public class CarDriver {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car hisCar = new Car("Black",400,3.5,"Honda");
		Car herCar = new Car("Pink",300,2.5,"Volks");
		
		/**
		 * Use toString
		 */
		
		System.out.println("  myCar " + "\n" + myCar.toString());
		System.out.println("  hisCar " + "\n" + hisCar.toString());
		System.out.println("  herCar " + "\n" + herCar.toString());
		
		/**
		 * Use setColor, setHorsePower, setEngineSize, setMake for myCar
		 */
		
		myCar.setColor("Blue");
		myCar.setHorsePower((650));
		myCar.setEngineSize(6.5);
		myCar.setMake("Ferrari");
		// myCar = new Car("Blue",650,6.5,"Ferrari");
		
		/**
		 * Use getColor, getHorsePower, getEngineSize, getMake for myCar
		 */
		System.out.println("  New myCar " +
						   "\nColor: " + myCar.getColor() + 
						   ", Horse Power: " + myCar.getHorsePower() + 
						   ", Engine Size: " +  myCar.getEngineSize() + 
						   ", Make: " + myCar.getMake());}
}
