
/**
 * @author Yajur Vashisht
* The class Temperature represents a converting code which will receive the temperature in
* Fahrenheit and convert it to Celsius, both will be displayed to the user.
 */

public class Temperature {

	double degrees;
	
	/**
	 * @param d the method Temperature uses a double named d which can be called to get the value of temperature in F. 
	 */
	Temperature(double d) {
		this.degrees = d;
	}
	
	/**
	 * @return the method getCelsius() uses the above degrees and calculates the value in C opposed to F.
	 */
	double getCelsius() {
		return (5 *(this.degrees -32) /9);
	}
	
	public static void main(String[] args) {
		
		Temperature thermometer1 = new Temperature(20);
		Temperature thermometer2 = new Temperature(98.6);
		
		System.out.println(" The temperature of thermometer1 is "+thermometer1.degrees+" degrees Fahrenheit.");
		System.out.println(" The temperature of thermometer1 is "+String.format("%.2f",thermometer1.getCelsius())+" degrees Celsius.");
		System.out.println(" The temperature of thermometer2 is "+thermometer2.degrees+" degrees Fahrenheit.");
		System.out.println(" The temperature of thermometer2 is "+thermometer2.getCelsius()+" degrees Celsius.");
	}

}
